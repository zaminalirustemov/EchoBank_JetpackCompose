package com.zaminali.composeApp.presentation.ui.screens.landing.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.zaminali.composeApp.presentation.navigation.routes.HomeRoutes


/**
 * Navigation buttons for further actions.
 */
@Composable
fun NavigationButtons(navigateTo: (route: HomeRoutes) -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 90.dp)
    ) {
        NavigationButton("TRANSFER", HomeRoutes.TransfersScreen, navigateTo)
        Spacer(modifier = Modifier.height(8.dp))
        NavigationButton("GO TO SUBGRAPH", HomeRoutes.FirstSubGraphScreen, navigateTo)
    }
}