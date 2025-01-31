package com.zaminali.composeApp.presentation.ui.screens.subGraph

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.zaminali.composeApp.presentation.ui.screens.landing.Transaction
import com.zaminali.composeApp.presentation.ui.screens.landing.components.TransactionCard
import com.zaminali.composeApp.presentation.ui.screens.landing.sampleTransactions
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem.TextDark25

/**
 * Entry point Composable for the second subgraph screen in the application.
 * It initializes the screen with a navigation handler, setting the stage for displaying
 * transaction-related data.
 *
 * @param navigateTo Function to handle navigation actions based on the selected HomeRoutes.
 */
@Composable
fun SecondSubGraphRoute(navigateTo : (route : HomeRoutes) -> Unit) {
    SecondSubGraphScreen(navigateTo)
}

/**
 * Sets up the scaffold structure for the second subgraph screen, including a top bar
 * and the main content layout. This screen is designed to display detailed transactions
 * in a visually appealing way.
 *
 * @param navigateTo Function to handle navigation to different screens based on user actions.
 */
@Composable
fun SecondSubGraphScreen(navigateTo: (route: HomeRoutes) -> Unit) {
    Scaffold(
        containerColor = DesignSystem.DeepPurple,
        topBar = { TopAppBar("Subgraph Screen 2") },
        // This content lambda receives the padding values from Scaffold.
        // Scaffold automatically calculates these padding values based on the height of the TopBar.
        content = { paddingValues ->
            BodyContentSecondSub(paddingValues, navigateTo)
        }
    )
}

/**
 * Defines the layout and interaction elements of the second subgraph content,
 * focusing on displaying a list of transactions.
 *
 * @param paddingValues PaddingValues provided by the Scaffold to adjust the layout inside the Scaffold.
 * @param navigateTo Function to navigate to other screens or handle internal routing.
 */
@Composable
fun BodyContentSecondSub(
    paddingValues: PaddingValues,
    navigateTo: (route: HomeRoutes) -> Unit
) {
    Column(modifier = Modifier.padding(paddingValues)) {
    TransactionList()}
}

/**
 * Displays a list of transactions in a card format. This component reuses the TransactionCard
 * composable to maintain consistency across different parts of the application.
 *
 * @param transactions List of transactions to display. Defaults to a sample list if none provided.
 */
@Composable
fun TransactionList(transactions: List<Transaction> = sampleTransactions()) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        colors = CardDefaults.cardColors(containerColor = TextDark25),
        shape = RoundedCornerShape(20.dp),
    ) {
        Column {
            Text(
                "Same component as in the Landing screen",
                style = DesignSystem.TextTypography.displayLarge,
                modifier = Modifier.padding(16.dp)
            )

            LazyColumn {
                items(transactions) { transaction ->
                    TransactionCard(transaction)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_dot_indicator),
                    contentDescription = "3 dot indicator",
                    tint = Color.Unspecified,
                )
            }

            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}


@Preview
@Composable
private fun SecondSubGraphScreenPreview() {
    SecondSubGraphScreen({})
}
