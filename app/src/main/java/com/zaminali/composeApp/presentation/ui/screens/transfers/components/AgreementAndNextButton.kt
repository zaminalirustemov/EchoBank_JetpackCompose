package com.zaminali.composeApp.presentation.ui.screens.transfers.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem.TextDark25

/**
 * Creates a card layout that hosts several user interface components aimed at collecting user
 * consent and proceeding with an action. This includes a switch for selecting options, a field for
 * inputting the transfer amount, an agreement to terms and conditions, and a button to finalize
 * the action. The button also triggers a dialog upon clicking, indicating the next steps or success.
 *
 * The layout is organized vertically within a card, providing a clean and contained appearance.
 */
@Composable
fun AgreementAndNextButton() {
    Card(
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = TextDark25),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp, horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TransferSwitch()
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "TransferAmount",
                style = DesignSystem.DateTypography.displayLarge
            )
            Spacer(modifier = Modifier.height(8.dp))
            TransferAmountInput()
            Spacer(modifier = Modifier.height(12.dp))
            TermsAndConditionsAgreement()
            Spacer(modifier = Modifier.height(16.dp))
            NextButtonWithDialog()
        }
    }
}