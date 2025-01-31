package com.zaminali.composeApp.presentation.ui.screens.landing.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.zaminali.composeApp.presentation.ui.screens.landing.Transaction
import com.zaminali.composeApp.presentation.ui.screens.landing.sampleTransactions
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem


/**
 * Lists recent transactions using cards.
 */
@Composable
fun TransactionList(transactions: List<Transaction> = sampleTransactions()) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        colors = CardDefaults.cardColors(containerColor = DesignSystem.TextDark25),
        shape = RoundedCornerShape(20.dp)
    ) {
        Text(
            "Recent Transactions",
            style = DesignSystem.TextTypography.displayLarge,
            modifier = Modifier.padding(16.dp)
        )
        LazyColumn {
            items(transactions, itemContent = { transaction ->
                TransactionCard(transaction)
            })
        }
    }
}