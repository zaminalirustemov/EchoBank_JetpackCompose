package com.zaminali.composeApp.presentation.main

import com.zaminali.composeApp.common.base.INTENT
import com.zaminali.composeApp.common.base.REDUCE
import com.zaminali.composeApp.common.base.STATE


data class MainUiState(
    val isLoading: Boolean = false
) : STATE {

    sealed class MainReducedUiState : REDUCE {
        data class OnMainLoading(val isLoading: Boolean = false) : MainReducedUiState()
    }

}

sealed class MainIntent : INTENT {
    data class OnMainLoading(val isLoading: Boolean = false) : MainIntent()
}