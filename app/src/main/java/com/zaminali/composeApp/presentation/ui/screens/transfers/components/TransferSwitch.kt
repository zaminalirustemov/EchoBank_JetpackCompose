package com.zaminali.composeApp.presentation.ui.screens.transfers.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem

/**
 * Provides a toggle switch that allows users to choose between different types of transfer options:
 * Instant (EFTN) and Standard (BEFTN). This switch facilitates user interaction by allowing them
 * to select the desired transfer speed according to their needs.
 *
 * The switch is visually integrated into the application's design system, ensuring consistency across
 * the user interface. It also scales down to fit appropriately within the UI layout while maintaining
 * usability.
 */
@Composable
fun TransferSwitch() {
    var isSwitch by remember { mutableStateOf(true) }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Instant (EFTN)",
            style = DesignSystem.TextTypography.displayLarge
        )

        Box(
            modifier = Modifier
                .size(width = 32.dp, height = 16.dp),
            contentAlignment = Alignment.Center
        ) {
            Switch(
                checked = isSwitch,
                onCheckedChange = { isSwitch = it },
                modifier = Modifier
                    .scale(0.6f),
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color(0xFF1F1750),
                    uncheckedThumbColor = Color(0xFF1F1750),
                    checkedTrackColor = Color(0xFF2DD7AE),
                    uncheckedTrackColor = DesignSystem.SoftPurple,
                    checkedBorderColor = Color.Transparent,
                    uncheckedBorderColor = Color.Transparent
                )
            )
        }


        Text(
            text = "Standard (BEFTN)",
            style = DesignSystem.TextTypography.displayLarge
        )
    }
}