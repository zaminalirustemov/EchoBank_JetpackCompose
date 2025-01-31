package com.zaminali.composeApp.presentation.ui.screens.common.topBar.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.zaminali.ComposeApp.R

/**
 * Represents a back button within the application's top app bar.
 *
 * @param onClick Function to execute when the back button is pressed.
 */
@Composable
fun BackButton(onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(32.dp)
            .background(color = Color(0x401F1750), shape = CircleShape)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_arrow_left),
            contentDescription = "Back",
            tint = Color.White,
            modifier = Modifier.size(18.dp)
        )
    }
}
