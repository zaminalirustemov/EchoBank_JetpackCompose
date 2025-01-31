package com.zaminali.composeApp.presentation.ui.screens.common.topBar.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


/**
 * Renders a row of icons typically found in the top app bar, including search,
 * notifications, and user profile.
 */
@Composable
fun AppBarIcons() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        SearchIcon()
        Spacer(modifier = Modifier.width(12.dp))
        NotificationIcon()
        Spacer(modifier = Modifier.width(12.dp))
        UserProfileIcon()
    }
}
