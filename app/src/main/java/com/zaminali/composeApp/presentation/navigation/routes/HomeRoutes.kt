package com.zaminali.composeApp.presentation.navigation.routes

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
sealed class HomeRoutes(val route: String) : Parcelable{

    @Serializable
    @Parcelize
    data object LandingScreen : HomeRoutes("landing_screen")


    @Serializable
    @Parcelize
    data object TransfersScreen : HomeRoutes("transfers_screen")

    @Serializable
    @Parcelize
    data object FirstSubGraphScreen : HomeRoutes("first_sub_screen")

    @Serializable
    @Parcelize
    data object SecondSubGraphScreen : HomeRoutes("second_sub_screen")
}