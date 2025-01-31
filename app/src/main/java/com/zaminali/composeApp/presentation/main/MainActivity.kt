package com.zaminali.composeApp.presentation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.zaminali.ComposeApp.R
import com.zaminali.composeApp.presentation.navigation.graphs.MainGraph
import com.zaminali.composeApp.presentation.navigation.routes.HomeRoutes
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem.ActiveColor
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem.InactiveColor
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem.DarkPurple
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val items = mutableListOf(
                BottomNavigationItem.Home,
            )

            val navController = rememberNavController()
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = navBackStackEntry?.destination

            var showBottomBar by remember {
                mutableStateOf(false)
            }

            showBottomBar = when (currentDestination?.route) {
                else -> true
            }

            Scaffold(
                modifier = Modifier.navigationBarsPadding().statusBarsPadding(),
                bottomBar = {
                    if (showBottomBar) {
                        data class NavItem(val route: String, val icon: Int, val label: String)

                        val navItemList = listOf(
                            NavItem("home", R.drawable.quick_actions, "Home"),
                            NavItem("orders", R.drawable.quick_actions_2, "Orders"),
                            NavItem("transfer", R.drawable.quick_actions_3, "Transfer"),
                            NavItem("info", R.drawable.quick_actions_4, "Info"),
                            NavItem("gift", R.drawable.quick_actions_6, "Gifts")
                        )

                        NavigationBar(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(72.dp) // Custom height to match design
                                .background(DarkPurple),
                            containerColor = DarkPurple
                        ) {
                            navItemList.forEachIndexed() { index, item ->
                                val isSelected = index == 2 // val isSelected = currentDestination?.route == item.route


                                NavigationBarItem(
                                    selected = isSelected,
                                    onClick = {
                                        //TODO
                                    },
                                    label = {
                                        if (isSelected) {
                                            Column(
                                                horizontalAlignment = Alignment.CenterHorizontally
                                            ) {
                                                Text(
                                                    text = item.label,
                                                    fontSize = 12.sp,
                                                    color = Color.White
                                                )
                                                Spacer(modifier = Modifier.height(4.dp))
                                                Icon(
                                                    imageVector = ImageVector.vectorResource(id = item.icon),
                                                    contentDescription = item.label,
                                                    modifier = Modifier.size(24.dp),
                                                    tint = ActiveColor
                                                )
                                            }
                                        } else {
                                            Icon(
                                                imageVector = ImageVector.vectorResource(id = item.icon),
                                                contentDescription = item.label,
                                                modifier = Modifier.size(24.dp),
                                                tint = InactiveColor
                                            )
                                        }
                                    },
                                    icon = { }
                                )
                            }
                        }
                    }
                }
            ) { innerPadding ->
                MainGraph(innerPadding, navHostController = navController)
            }

        }
    }
}

sealed class BottomNavigationItem(
    @DrawableRes val icon: Int,
    @StringRes val title: Int,
    val route: HomeRoutes,
) {
    data object Home : BottomNavigationItem(
        icon = R.drawable.ic_launcher_background,
        title = R.string.app_name,
        route = HomeRoutes.TransfersScreen
    )

}
