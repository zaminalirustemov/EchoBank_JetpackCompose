package com.zaminali.composeApp.presentation.ui.screens.transfers.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.zaminali.ComposeApp.R

/**
 * Displays a horizontal pager that allows users to swipe through available transfer cards.
 * The pager enables smooth navigation between different stored payment methods.
 *
 * Each card in the pager represents a payment method, displaying essential details such as
 * the cardholder's name, masked card number, expiry date, and associated bank or provider icons.
 *
 * The selected card is highlighted visually by adjusting its size to make it more prominent.
 */
@Composable
fun TransferCardPager() {
    val cards = listOf(
        TransferCardData(
            "Jeremy Smith",
            "••••  ••••  ••••  7322",
            "09/22",
            R.drawable.ic_echo,
            R.drawable.ic_chips
        ),
        TransferCardData(
            "Emily Johnson",
            "••••  ••••  ••••  9821",
            "11/24",
            R.drawable.ic_echo,
            R.drawable.ic_chips
        ),
        TransferCardData(
            "Michael Brown",
            "••••  ••••  ••••  5678",
            "07/23",
            R.drawable.ic_echo,
            R.drawable.ic_chips
        )
    )

    val pagerState = rememberPagerState(initialPage = 0)

    HorizontalPager(
        count = cards.size,
        state = pagerState,
        contentPadding = PaddingValues(horizontal = 40.dp)
    ) { page ->
        TransferCard(data = cards[page], isSelected = page == pagerState.currentPage)
    }
}

data class TransferCardData(
    val cardHolder: String,
    val cardNumber: String,
    val expiry: String,
    val iconLeft: Int,
    val iconRight: Int
)