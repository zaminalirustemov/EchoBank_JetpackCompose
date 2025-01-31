package com.zaminali.composeApp.presentation.ui.screens.transfers.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.zaminali.ComposeApp.R
import com.zaminali.composeApp.presentation.ui.screens.transfers.components.dialog.SuccessDialog
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem.DarkPurple
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem.MainTextTypography
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem.MintGreen

/**
 * Displays a "Next" button that, when clicked, triggers a success dialog to appear.
 * The dialog is used to indicate a successful action, typically after a user confirmation
 * or completion of a process. This composable manages the visibility state of the dialog
 * based on user interaction.
 *
 * The button is styled with specific design system colors and contains both text and an icon
 * to clearly convey its purpose.
 */
@Composable
fun NextButtonWithDialog() {
    var showDialog by remember { mutableStateOf(false) }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 75.dp),
            onClick = { showDialog = true },
            colors = ButtonDefaults.buttonColors(containerColor = MintGreen)
        ) {
            Text("NEXT", style = MainTextTypography.displayLarge.copy(color = DarkPurple))
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_arrow_right),
                contentDescription = "Arrow right",
                tint = Color.Unspecified,
            )
        }

        if (showDialog) {
            SuccessDialog(onDismiss = { showDialog = false })
        }
    }
}