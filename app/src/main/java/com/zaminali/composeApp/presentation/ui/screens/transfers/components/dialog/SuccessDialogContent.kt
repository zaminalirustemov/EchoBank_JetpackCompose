package com.zaminali.composeApp.presentation.ui.screens.transfers.components.dialog

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Renders the content inside the success dialog which includes several UI components
 * such as an icon indicating success, messages about the transaction, and a dismiss button.
 * This composable arranges these elements vertically in a column.
 *
 * @param onDismiss A lambda function that is called when the dismiss action is triggered.
 *                  This function is typically used to close the dialog.
 */
@Composable
fun SuccessDialogContent(onDismiss: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SuccessIcon()
        Spacer(modifier = Modifier.height(16.dp))
        SuccessMessage()
        Spacer(modifier = Modifier.height(60.dp))
        ArrivalEstimate()
        Spacer(modifier = Modifier.height(24.dp))
        DismissButtonRow(onDismiss)
    }
}