package com.zaminali.composeApp.presentation.ui.screens.landing.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.zaminali.composeApp.presentation.ui.screens.landing.Transaction
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem


/**
 * Displays transaction amount and rate.
 */
@Composable
fun TransactionIndicators(transaction: Transaction) {
    Column(horizontalAlignment = Alignment.End) {
        Text(
            text = transaction.amount,
            style = if (transaction.isPositive) DesignSystem.MainTextTypography.displayLarge
            else DesignSystem.MainTextTypography.displayLarge.copy(color = DesignSystem.SoftRed)
        )
        Text("Rate ${transaction.rate}", style = DesignSystem.DateTypography.displayLarge)
    }
}