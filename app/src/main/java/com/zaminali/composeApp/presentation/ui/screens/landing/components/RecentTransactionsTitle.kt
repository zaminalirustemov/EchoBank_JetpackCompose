package com.zaminali.composeApp.presentation.ui.screens.landing.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem


/**
 * Displays the title for the transactions section.
 */
@Composable
fun RecentTransactionsTitle() {
    Text(
        "Recent Transactions",
        style = DesignSystem.TextTypography.displayLarge,
        modifier = Modifier.padding(16.dp)
    )
}
