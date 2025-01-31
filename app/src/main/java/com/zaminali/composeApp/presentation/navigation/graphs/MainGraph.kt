package com.zaminali.composeApp.presentation.navigation.graphs

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.zaminali.composeApp.presentation.navigation.routes.GraphRoutes

@Composable
fun MainGraph(paddingValues: PaddingValues, navHostController: NavHostController){

    NavHost(
        navController = navHostController,
        startDestination = GraphRoutes.HomeGraph
    ){
        homeGraph(navHostController)
    }
}