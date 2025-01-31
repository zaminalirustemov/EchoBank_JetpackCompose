package com.zaminali.composeApp.presentation.main

import com.zaminali.composeApp.common.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() :
    BaseViewModel<MainUiState, MainUiState.MainReducedUiState, MainIntent>(MainUiState()) {


    override fun onIntent(intent: MainIntent): MainUiState.MainReducedUiState {
        return when (intent) {
            is MainIntent.OnMainLoading -> MainUiState.MainReducedUiState.OnMainLoading(intent.isLoading)
        }
    }

    override fun reduceUiState(
        state: MainUiState,
        action: MainUiState.MainReducedUiState
    ): MainUiState {
        return when (action) {
            is MainUiState.MainReducedUiState.OnMainLoading -> state.copy(isLoading = action.isLoading)
        }
    }

    private fun mainIntentAction(intent: MainIntent) {
        when (intent) {
            is MainIntent.OnMainLoading -> setIntent(intent)
        }
    }

}