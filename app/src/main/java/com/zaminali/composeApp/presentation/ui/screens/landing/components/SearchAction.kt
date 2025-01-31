package com.zaminali.composeApp.presentation.ui.screens.landing.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


/**
 * Search icon for the top bar.
 */
@Composable
fun SearchAction() {
    Icon(Icons.Default.Search, contentDescription = "Search", tint = Color.White)
}