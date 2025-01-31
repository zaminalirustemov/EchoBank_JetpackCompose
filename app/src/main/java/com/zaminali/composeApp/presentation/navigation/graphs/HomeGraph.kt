package com.zaminali.composeApp.presentation.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.zaminali.composeApp.presentation.navigation.routes.GraphRoutes
import com.zaminali.composeApp.presentation.navigation.routes.HomeRoutes
import com.zaminali.composeApp.presentation.ui.screens.landing.LandingRoute
import com.zaminali.composeApp.presentation.ui.screens.subGraph.FirstSubGraphRoute
import com.zaminali.composeApp.presentation.ui.screens.subGraph.SecondSubGraphRoute
import com.zaminali.composeApp.presentation.ui.screens.subGraph.SecondSubGraphScreen
import com.zaminali.composeApp.presentation.ui.screens.transfers.TransfersRoute

fun NavGraphBuilder.homeGraph(
    navHostController: NavHostController
){
    navigation<GraphRoutes.HomeGraph>(
        startDestination = HomeRoutes.LandingScreen
    ){
        composable<HomeRoutes.LandingScreen>{
            LandingRoute(navigateTo = {navHostController.navigate(it)})
        }
        composable<HomeRoutes.TransfersScreen>{
            TransfersRoute(navigateTo = {navHostController.navigate(it)})
        }
        composable<HomeRoutes.FirstSubGraphScreen>{
            FirstSubGraphRoute(navigateTo = {navHostController.navigate(it)})
        }
        composable<HomeRoutes.SecondSubGraphScreen>{
            SecondSubGraphRoute(navigateTo = {navHostController.navigate(it)})
        }
    }

}