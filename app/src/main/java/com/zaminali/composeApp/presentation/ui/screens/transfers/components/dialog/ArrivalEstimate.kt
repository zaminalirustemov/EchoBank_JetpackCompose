package com.zaminali.composeApp.presentation.ui.screens.transfers.components.dialog

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem


/**
 * Shows an estimated time of arrival for the money transfer.
 */
@Composable
fun ArrivalEstimate() {
    Text(
        text = "Estimated arrival: 5 minutes",
        style = DesignSystem.DateTypography.displayLarge.copy(color = Color.White)
    )
}