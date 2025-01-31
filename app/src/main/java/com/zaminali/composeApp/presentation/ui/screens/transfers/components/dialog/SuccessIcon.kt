package com.zaminali.composeApp.presentation.ui.screens.transfers.components.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Displays a circular success icon using a Box container to center the icon visually.
 * This icon is meant to visually represent the successful completion of an operation, typically
 * used in dialogs or notifications where success needs to be highlighted.
 *
 * The success icon is styled with a specific background color and an icon tint to ensure
 * it stands out and clearly communicates success.
 */
@Composable
fun SuccessIcon() {
    Box(
        modifier = Modifier
            .padding(top = 52.dp)
            .size(64.dp)
            .background(Color(0xFF2DD7AE), shape = CircleShape),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Default.Check,
            contentDescription = "Success",
            tint = Color(0xFF1F1750),
            modifier = Modifier.size(32.dp)
        )
    }
}