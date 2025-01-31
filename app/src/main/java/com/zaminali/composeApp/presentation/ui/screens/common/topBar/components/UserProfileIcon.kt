package com.zaminali.composeApp.presentation.ui.screens.common.topBar.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.zaminali.ComposeApp.R

/**
 * Displays an icon for accessing the user profile.
 */
@Composable
fun UserProfileIcon() {
    Image(
        painter = painterResource(id = R.drawable.baseline_person_3_24),
        contentDescription = "User Profile",
        modifier = Modifier.size(36.dp)
    )
}
