package com.zaminali.composeApp.presentation.ui.screens.transfers.components.dialog

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.zaminali.ComposeApp.R
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem.DarkPurple
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem.SoftPurple

/**
 * Displays a dialog to indicate successful completion of an action, such as a transaction.
 * This dialog includes a custom content layout and an icon button to dismiss the dialog.
 *
 * @param onDismiss A lambda function that is invoked when the dialog needs to be dismissed.
 *                  This is typically tied to the dismiss button in the UI but can also handle
 *                  additional cleanup if necessary.
 */
@Composable
fun SuccessDialog(onDismiss: () -> Unit) {
    Dialog(onDismissRequest = onDismiss) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            contentAlignment = Alignment.Center
        ) {
            Card(
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = DarkPurple),
                modifier = Modifier.fillMaxWidth()
            ) {
                SuccessDialogContent(onDismiss)

            }
            IconButton(
                onClick = onDismiss,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(16.dp)
                    .size(24.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_close),
                    contentDescription = "Card Logo",
                    tint = SoftPurple,
                )
            }
        }
    }
}