package com.zaminali.composeApp.presentation.ui.screens.subGraph

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zaminali.ComposeApp.R
import com.zaminali.composeApp.presentation.navigation.routes.HomeRoutes
import com.zaminali.composeApp.presentation.ui.screens.common.topBar.TopAppBar
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem.DarkPurple
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem.MainTextTypography
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem.MintGreen
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem.TextDark25

/**
 * Serves as the entry point for the first subgraph screen in the application,
 * initializing the screen with navigation capabilities.
 *
 * @param navigateTo Function to handle navigation actions based on the selected HomeRoutes.
 */
@Composable
fun FirstSubGraphRoute(navigateTo: (route: HomeRoutes) -> Unit) {
    FirstSubGraphScreen(navigateTo)
}

/**
 * Sets up the scaffold structure for the first subgraph screen, including a top bar
 * and the main content layout. This screen is part of a series of subgraph screens
 * designed to display complex interconnected data or options.
 *
 * @param navigateTo Function to handle navigation to different screens based on user actions.
 */
@Composable
fun FirstSubGraphScreen(navigateTo: (route: HomeRoutes) -> Unit) {
    Scaffold(
        containerColor = DesignSystem.DeepPurple,
        topBar = { TopAppBar("Subgraph Screen 1") },
        // This content lambda receives the padding values from Scaffold.
        // Scaffold automatically calculates these padding values based on the height of the TopBar.
        content = { paddingValues ->
            BodyContentFirstSub(paddingValues, navigateTo)
        }
    )
}

/**
 * Defines the layout and interaction elements of the first subgraph content.
 * Includes a button within a card that navigates to the next subgraph screen when clicked.
 *
 * @param paddingValues PaddingValues provided by the Scaffold to adjust the layout inside the Scaffold.
 * @param navigateTo Function to navigate to the second subgraph screen.
 */
@Composable
fun BodyContentFirstSub(
    paddingValues: PaddingValues,
    navigateTo: (route: HomeRoutes) -> Unit
) {
    Column(modifier = Modifier.padding(paddingValues)) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            colors = CardDefaults.cardColors(containerColor = TextDark25),
            shape = RoundedCornerShape(20.dp),
        ) {
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 75.dp, vertical = 20.dp),
                onClick = {
                    navigateTo.invoke(HomeRoutes.SecondSubGraphScreen)
                },
                colors = ButtonDefaults.buttonColors(containerColor = MintGreen)
            ) {
                Text("NEXT", style = MainTextTypography.displayLarge.copy(color = DarkPurple))
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_arrow_right),
                    contentDescription = "Arrow right",
                    tint = Color.Unspecified,
                )
            }
        }
    }
}

@Preview
@Composable
private fun FirstSubGraphScreenPreview() {
    FirstSubGraphScreen({})
}