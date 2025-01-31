package com.zaminali.composeApp.presentation.ui.screens.transfers.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem

/**
 * Displays a user avatar with their name in a column layout. This composable is used to represent
 * individual users, typically in lists or selection screens where user identification is required.
 *
 * The avatar is shown as a circular image, with the user's name displayed below it. This component
 * is designed to provide a clear, visual representation of a user, enhancing the user interface by
 * making it more interactive and visually appealing.
 *
 * @param user A data class containing user details such as name and avatar resource ID.
 */
@Composable
fun UserAvatar(user: User) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        Image(
            painter = painterResource(id = user.avatar),
            contentDescription = user.name,
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .background(Color.Gray)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = user.name,
            style = DesignSystem.TextTypography.displayLarge.copy(color = DesignSystem.SoftPurple)
        )
    }
}