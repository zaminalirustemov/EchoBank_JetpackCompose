package com.zaminali.composeApp.presentation.ui.screens.transfers.components.dialog

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem

/**
 * Displays a message indicating that the money transfer process has been successfully initiated.
 * This message is intended to reassure the user that the action they initiated is being processed.
 *
 * The text is centered and styled to be visually significant, making it easy for users to recognize
 * the status of their transaction.
 */
@Composable
fun SuccessMessage() {
    Text(
        text = "Money is on the way!",
        style = DesignSystem.TextTypography.displayLarge.copy(fontSize = 20.sp),
        textAlign = TextAlign.Center
    )
}
