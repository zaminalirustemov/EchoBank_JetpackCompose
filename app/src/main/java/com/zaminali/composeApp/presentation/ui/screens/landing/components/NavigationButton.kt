package com.zaminali.composeApp.presentation.ui.screens.landing.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.zaminali.ComposeApp.R
import com.zaminali.composeApp.presentation.navigation.routes.HomeRoutes
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem


/**
 * A generic navigation button.
 */
@Composable
fun NavigationButton(text: String, route: HomeRoutes, navigateTo: (route: HomeRoutes) -> Unit) {
    Button(
        modifier = Modifier.fillMaxWidth(),
        onClick = { navigateTo.invoke(route) },
        colors = ButtonDefaults.buttonColors(containerColor = DesignSystem.MintGreen)
    ) {
        Text(text, style = DesignSystem.MainTextTypography.displayLarge.copy(color = DesignSystem.DarkPurple))
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_arrow_right),
            contentDescription = "Arrow right",
            tint = Color.Unspecified
        )
    }
}