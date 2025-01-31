package com.zaminali.composeApp.presentation.ui.screens.common.topBar.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Displays the title bar of the application with a back button and page title.
 *
 * @param pageTitle The title of the current page to be displayed.
 */
@Composable
fun AppBarTitle(pageTitle: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        BackButton(onClick = {})
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "Landing / ",
            color = Color.White.copy(alpha = 0.6f),
            fontSize = 14.sp
        )
        Text(
            text = pageTitle,
            color = Color.White,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}