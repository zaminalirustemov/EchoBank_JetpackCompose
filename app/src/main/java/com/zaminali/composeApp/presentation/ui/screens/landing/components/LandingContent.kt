package com.zaminali.composeApp.presentation.ui.screens.landing.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.zaminali.composeApp.presentation.navigation.routes.HomeRoutes


/**
 * Main content area of the landing screen.
 */
@Composable
fun LandingContent(
    paddingValues: PaddingValues,
    navigateTo: (route: HomeRoutes) -> Unit
) {
    Column(modifier = Modifier.padding(paddingValues)) {
        Spacer(modifier = Modifier.height(8.dp))
        RecentTransactionsTitle()
        TransactionList()
        NavigationButtons(navigateTo)
    }
}