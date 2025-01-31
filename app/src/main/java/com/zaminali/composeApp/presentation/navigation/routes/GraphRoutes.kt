package com.zaminali.composeApp.presentation.navigation.routes

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
sealed class GraphRoutes(val graphRoute : String) : Parcelable {

    @Serializable
    @Parcelize
    data object MainGraph : GraphRoutes("main_graph")

    @Serializable
    @Parcelize
    data object HomeGraph : GraphRoutes("home_graph")

}