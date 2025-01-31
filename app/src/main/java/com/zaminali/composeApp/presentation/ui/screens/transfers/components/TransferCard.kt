package com.zaminali.composeApp.presentation.ui.screens.transfers.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zaminali.ComposeApp.R
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem

/**
 * Represents a single card used in a horizontal pager for selecting a payment method or card.
 * The card displays important information such as the card holder's name, card number, expiry date,
 * and associated logos. The visual presentation changes slightly depending on whether the card
 * is selected or not, making the selected card more prominent.
 *
 * @param data An instance of `TransferCardData` containing the details to be displayed on the card.
 * @param isSelected A Boolean value indicating whether the card is currently selected, affecting
 *                   its size and potentially other style elements to highlight it.
 */
@Composable
fun TransferCard(data: TransferCardData, isSelected: Boolean) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = DesignSystem.DeepPurple),
        modifier = Modifier
            .width(if (isSelected) 360.dp else 320.dp)
            .height(if (isSelected) 230.dp else 210.dp)
    ) {
        Column(modifier = Modifier.padding(vertical = 16.dp, horizontal = 4.dp)) {
            Spacer(modifier = Modifier.height(8.dp))
            Card(
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1F1750)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 12.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = data.iconLeft),
                            contentDescription = "Card Logo",
                            tint = DesignSystem.SoftPurple
                        )
                        Icon(
                            painter = painterResource(id = data.iconRight),
                            contentDescription = "Card Chips",
                            tint = DesignSystem.SoftPurple
                        )
                    }
                    Spacer(modifier = Modifier.height(18.dp))
                    Text(text = data.cardHolder, style = DesignSystem.TextTypography.displayLarge)
                    Text(
                        text = data.cardNumber,
                        modifier = Modifier.padding(vertical = 8.dp),
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Exp ${data.expiry}",
                            style = DesignSystem.DateTypography.displayLarge
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.ic_payment_method),
                            contentDescription = "payment",
                            tint = DesignSystem.SoftPurple
                        )
                    }
                }
            }
        }
    }
}