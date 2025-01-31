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
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem


/**
 * Displays a clickable search icon.
 */
@Composable
fun SearchIcon() {
    Box(
        modifier = Modifier
            .size(32.dp)
            .background(color = Color(0x401F1750), shape = CircleShape)
            .clickable { /* TODO: Handle search */ },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = "Search",
            modifier = Modifier.size(24.dp),
            tint = DesignSystem.MintGreen
        )
    }
}