package com.zaminali.composeApp.presentation.ui.screens.common.topBar.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.zaminali.ComposeApp.R

/**
 * Displays a notification icon.
 */
@Composable
fun NotificationIcon() {
    Icon(
        painter = painterResource(id = R.drawable.ic_notification),
        contentDescription = "Notifications",
        modifier = Modifier.size(24.dp),
        tint = Color.White
    )
}
