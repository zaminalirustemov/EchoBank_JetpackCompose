package com.zaminali.composeApp.presentation.ui.screens.transfers.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem

/**
 * Displays a title for a section of the UI where users can initiate a money transfer.
 * This Composable function enhances the UI by clearly labeling the transfer section,
 * aiding in user navigation and understanding of the interface.
 *
 * The text is styled using the application's design system to maintain consistency and
 * ensure readability.
 */
@Composable
fun TransferFromTitle() {
    Text(
        modifier = Modifier.padding(start = 20.dp),
        text = "Transfer from",
        style = DesignSystem.TextTypography.displayLarge
    )
}