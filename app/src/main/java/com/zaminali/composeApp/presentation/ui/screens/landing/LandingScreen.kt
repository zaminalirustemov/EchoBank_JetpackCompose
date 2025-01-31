package com.zaminali.composeApp.presentation.ui.screens.landing

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.zaminali.ComposeApp.R
import com.zaminali.composeApp.presentation.navigation.routes.HomeRoutes
import com.zaminali.composeApp.presentation.ui.screens.landing.components.LandingContent
import com.zaminali.composeApp.presentation.ui.screens.landing.components.TopBar
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem

/**
 * Entry point for the landing screen that sets up the scaffold and inner components.
 */
@Composable
fun LandingRoute(navigateTo: (route: HomeRoutes) -> Unit) {
    Scaffold(
        containerColor = DesignSystem.DeepPurple,
        topBar = { TopBar() },
        content = { paddingValues -> LandingContent(paddingValues, navigateTo) }
    )
}

@Preview
@Composable
fun PreviewLandingScreen() {
    LandingRoute {}
}

data class Transaction(
    val photo: Int,
    val title: String,
    val amount: String,
    val date: String,
    val rate: String,
    val isPositive: Boolean
)

fun sampleTransactions() = listOf(
    Transaction(
        R.drawable.baseline_person_3_24,
        "Albert Flores",
        "+$1526.32",
        "22 May, 2022",
        "2%",
        true
    ),
    Transaction(
        R.drawable.baseline_person_24,
        "Fiver",
        "-$1526.32",
        "21 May, 2022",
        "2%",
        false
    ),
    Transaction(
        R.drawable.baseline_person_3_24,
        "Bank of America Ltd.",
        "$15426.32",
        "22 May, 2022",
        "4%",
        true
    )
)
