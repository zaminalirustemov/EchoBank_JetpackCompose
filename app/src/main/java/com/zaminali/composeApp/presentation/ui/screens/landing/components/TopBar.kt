package com.zaminali.composeApp.presentation.ui.screens.landing.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem


/**
 * The top bar of the landing screen, containing logo and search icon.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(containerColor = DesignSystem.DeepPurple),
        title = { LogoRow() },
        actions = { SearchAction() }
    )
}