package com.zaminali.composeApp.presentation.ui.screens.transfers.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.zaminali.ComposeApp.R

/**
 * Displays a horizontally scrolling row of user avatars. This component is used primarily for
 * selecting or displaying multiple users in a concise and visually appealing manner.
 *
 * Each avatar in the row is interactive and represents a user with their name and profile picture.
 * The `LazyRow` component is used to efficiently load and display a potentially large number of
 * avatars without impacting performance.
 *
 * @param users A list of user data, where each user is represented by a name and an avatar image resource ID.
 */
@Composable
fun UserAvatarsRow() {
    // Example user list
    val users = listOf(
        User("Devon Lane", R.drawable.profile_image_1),
        User("Jerome Bell", R.drawable.profile_image_2),
        User("Wade Warren", R.drawable.profile_image_3),
        User("Devon Lane", R.drawable.profile_image_1),
        User("Jerome Bell", R.drawable.profile_image_2),
        User("Wade Warren", R.drawable.profile_image_3),
        User("Devon Lane", R.drawable.profile_image_1),
        User("Jerome Bell", R.drawable.profile_image_2),
        User("Wade Warren", R.drawable.profile_image_3),
    )

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(users) { user -> UserAvatar(user) }
    }
}

// Sample User Data
data class User(val name: String, val avatar: Int)