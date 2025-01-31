package com.zaminali.composeApp.presentation.ui.screens.landing.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.zaminali.ComposeApp.R


/**
 * Row of logos for the top bar.
 */
@Composable
fun LogoRow() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_eco_bank_logo),
            contentDescription = "Eco Bank Logo",
            tint = Color.Unspecified
        )
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_eco_bank_ltd),
            contentDescription = "Eco Bank Logo",
            tint = Color.Unspecified
        )
    }
}
