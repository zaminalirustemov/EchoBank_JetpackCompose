package com.zaminali.composeApp.presentation.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zaminali.ComposeApp.R

object DesignSystem {
    val DeepPurple = Color(0xFF352F58)
    val TextDark25 = Color(0xFF1F1750).copy(alpha = 0.25f)
    val SoftPurple = Color(0xFFC2BCE4)
    val SoftRed = Color(0xFFFF6678)
    val MintGreen = Color(0xFF2DD7AE)
    val DarkPurple = Color(0xFF1F1750)
    val ActiveColor = Color(0xFF2DD7AE)
    val InactiveColor = Color(0x66FFFFFF)
    val TopBarBackground = DarkPurple.copy(alpha = 0.25f)

    val colors = lightColorScheme(
        primary = Color(0xFF6200EE),
        primaryContainer = Color(0xFF3700B3),
        secondary = Color(0xFF03DAC6)
    )


    private val OutfitMediumFontFamily = FontFamily(Font(R.font.outfit_medium))
    private val OutfitRegularFontFamily = FontFamily(Font(R.font.outfit_medium))

    val TextTypography = Typography(
        displayLarge = TextStyle(
            fontFamily = OutfitMediumFontFamily,
            fontWeight = FontWeight.W500,
            fontSize = 14.sp,
            lineHeight = 17.64.sp,
            color = Color.White
        )
    )

    val NameTypography = Typography(
        displayLarge = TextStyle(
            fontFamily = OutfitMediumFontFamily,
            fontWeight = FontWeight.W500,
            fontSize = 12.sp,
            lineHeight = 15.12.sp,
            color = Color.White
        )
    )

    val DateTypography = Typography(
        displayLarge = TextStyle(
            fontFamily = OutfitRegularFontFamily,
            fontWeight = FontWeight.W400,
            fontSize = 12.sp,
            lineHeight = 15.12.sp,
            color = SoftPurple
        )
    )

    val MainTextTypography = Typography(
        displayLarge = TextStyle(
            fontFamily = OutfitMediumFontFamily,
            fontWeight = FontWeight.W700,
            fontSize = 12.sp,
            lineHeight = 15.12.sp,
            color = Color.White
        )
    )

    val shapes = Shapes(
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(8.dp),
        large = RoundedCornerShape(16.dp)
    )
}
