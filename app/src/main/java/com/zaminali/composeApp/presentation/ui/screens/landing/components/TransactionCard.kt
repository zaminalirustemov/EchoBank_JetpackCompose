package com.zaminali.composeApp.presentation.ui.screens.landing.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.zaminali.composeApp.presentation.ui.screens.landing.Transaction
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem


/**
 * Displays a single transaction card.
 */
@Composable
fun TransactionCard(transaction: Transaction) {
    Row(
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Transaction details
        Image(
            painter = painterResource(id = transaction.photo),
            contentDescription = "Profile Picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(40.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(transaction.title, style = DesignSystem.NameTypography.displayLarge)
            Text(transaction.date, style = DesignSystem.DateTypography.displayLarge)
        }
        // Transaction indicators (like amount and rate)
        TransactionIndicators(transaction)
    }
}