package com.zaminali.composeApp.presentation.ui.screens.transfers.components.dialog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem.DarkPurple
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem.MainTextTypography
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem.MintGreen

/**
 * Provides a button for dismissing the success dialog.
 * @param onDismiss Function to be called to dismiss the dialog.
 */
@Composable
fun DismissButtonRow(onDismiss: () -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.End
    ) {
        Button(
            onClick = onDismiss,
            colors = ButtonDefaults.buttonColors(containerColor = MintGreen),
            shape = RoundedCornerShape(18.dp),
            modifier = Modifier
                .width(120.dp)
                .height(36.dp)
        ) {
            Text(
                "DONE",
                style = MainTextTypography.displayLarge.copy(color = DarkPurple)
            )
        }
    }
}