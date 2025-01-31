package com.zaminali.composeApp.presentation.ui.screens.transfers

import com.zaminali.composeApp.common.base.INTENT
import com.zaminali.composeApp.common.base.REDUCE
import com.zaminali.composeApp.common.base.STATE

data class TransfersUiState(
    val firstState : Boolean = false,
    val secondState : Boolean = false
): STATE {

    sealed class ReduceUiState : REDUCE {

        data class FirstState(val firstState : Boolean = false) : ReduceUiState()

        data class SecondState(val secondState : Boolean = false) : ReduceUiState()

    }

}

sealed class TransfersIntents : INTENT {

    data object OnFirstStateEvent : TransfersIntents()

    data object OnSecondStateEvent : TransfersIntents()

}