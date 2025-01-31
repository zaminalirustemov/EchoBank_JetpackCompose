package com.zaminali.composeApp.presentation.ui.screens.common.topBar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.zaminali.composeApp.presentation.ui.screens.common.topBar.components.AppBarIcons
import com.zaminali.composeApp.presentation.ui.screens.common.topBar.components.AppBarTitle
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem


/**
 * Constructs the top app bar of the application with a customizable title and icon set.
 *
 * @param pageTitle The title of the page displayed in the top app bar.
 */
@Composable
fun TopAppBar(pageTitle: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = DesignSystem.TopBarBackground,
                shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp)
            )
            .padding(horizontal = 20.dp, vertical = 16.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            AppBarTitle(pageTitle = pageTitle)
            AppBarIcons()
        }
    }
}
