package com.zaminali.composeApp.common.base


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zaminali.composeApp.presentation.main.MainIntent
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

abstract class BaseViewModel<State : STATE, ReducedUiState : REDUCE, Intent : INTENT>(
    initialState: State,
    private val onMainIntent: ((intent: MainIntent) -> Unit)? = null
) : ViewModel() {

    private  val _uiState = MutableStateFlow(initialState)
    val uiState : StateFlow<State>  get() = _uiState.asStateFlow()

    private val _uiIntent = MutableSharedFlow<Intent>()
    private val uiIntent : SharedFlow<Intent> get() = _uiIntent.asSharedFlow()

    private val _reduceUiState = MutableSharedFlow<ReducedUiState>()
    private val reduceUiState : SharedFlow<ReducedUiState> get() = _reduceUiState.asSharedFlow()

    fun setIntent(intent: Intent){
        viewModelScope.launch { _uiIntent.emit(intent) }
    }

    init {
        uiIntent.onEach { intent ->
            handleReducedUiState(onIntent(intent))
        }.launchIn(viewModelScope)
        reduceUiState.onEach { action ->
            _uiState.value = reduceUiState(uiState.value, action)
        }.launchIn(viewModelScope)
    }

    private fun handleReducedUiState(reduceAction: ReducedUiState) {
        viewModelScope.launch { _reduceUiState.emit(reduceAction) }
    }

    protected inline fun <T> Flow<BaseResource<T>>.handleBaseResult(
        crossinline onComplete: (T) -> Unit,
        crossinline onError: (Exception) -> Unit,
        crossinline onLoading: () -> Unit = {},
        showLoading: Boolean = true
    ) {
        onEach { response ->
            when (response) {
                is BaseResource.Error -> {
                    if (showLoading) hideLoading()
                    onError(response.throwable)
                }

                is BaseResource.Success -> {
                    if (showLoading) hideLoading()
                    response.result?.let { onComplete(it) } ?: onError(Exception("Result is empty"))
                }

                is BaseResource.Loading -> {
                    if (showLoading) showLoading()
                    onLoading()
                }
            }
        }.launchIn(viewModelScope)
    }

    fun showLoading() {
        onMainIntent?.invoke(MainIntent.OnMainLoading(isLoading = true))
    }

    fun hideLoading() {
        onMainIntent?.invoke(MainIntent.OnMainLoading(isLoading = false))
    }

    abstract fun onIntent(intent: Intent) : ReducedUiState

    abstract fun reduceUiState(state: State, action: ReducedUiState): State

}