package com.zaminali.composeApp.presentation.ui.screens.transfers

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zaminali.composeApp.presentation.navigation.routes.HomeRoutes
import com.zaminali.composeApp.presentation.ui.screens.common.topBar.TopAppBar
import com.zaminali.composeApp.presentation.ui.screens.transfers.components.AgreementAndNextButton
import com.zaminali.composeApp.presentation.ui.screens.transfers.components.TransferCardPager
import com.zaminali.composeApp.presentation.ui.screens.transfers.components.TransferFromTitle
import com.zaminali.composeApp.presentation.ui.screens.transfers.components.UserAvatarsRow
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem

/**
 * Entry point Composable for the transfers route in the application.
 * It initializes the TransfersScreen with a navigation handler.
 *
 * @param navigateTo Function to handle navigation actions based on the selected HomeRoutes.
 */
@Composable
fun TransfersRoute(navigateTo: (route: HomeRoutes) -> Unit) {
    TransfersScreen(navigateTo)
}

/**
 * Sets up the scaffold structure for the money transfer screen,
 * including a top bar and the main content layout for transfer interactions.
 *
 * @param navigateTo Function to handle navigation to different screens based on user actions.
 */
@Composable
fun TransfersScreen(navigateTo: (route: HomeRoutes) -> Unit) {
    Scaffold(
        containerColor = DesignSystem.DeepPurple,
        topBar = { TopAppBar("Money Transfer") },
        // This content lambda receives the padding values from Scaffold.
        // Scaffold automatically calculates these padding values based on the height of the TopBar.
        content = { paddingValues ->
            BodyContentTransfer(paddingValues)
        }
    )
}

/**
 * Defines the layout of the content within the transfers screen.
 * This function arranges user avatars, a title, a pager for card selection,
 * and controls for agreement and proceeding with the transaction.
 *
 * @param paddingValues PaddingValues provided by the Scaffold to adjust the layout inside the Scaffold.
 */
@Composable
fun BodyContentTransfer(paddingValues: PaddingValues) {
    Column(modifier = Modifier.padding(paddingValues)) {
        Spacer(modifier = Modifier.height(8.dp))
        // User Avatars List
        UserAvatarsRow()
        Spacer(modifier = Modifier.height(16.dp))
        TransferFromTitle()
        // Transfer Card
        TransferCardPager()
        // Agreement Checkbox and Next Button
        AgreementAndNextButton()
    }
}


@Preview
@Composable
fun PreviewTransfersScreen() {
    TransfersScreen({})
}