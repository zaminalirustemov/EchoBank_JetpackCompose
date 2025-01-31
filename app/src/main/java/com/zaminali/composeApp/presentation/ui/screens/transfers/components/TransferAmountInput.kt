package com.zaminali.composeApp.presentation.ui.screens.transfers.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zaminali.composeApp.presentation.ui.theme.DesignSystem

/**
 * Provides a text field for users to input the transfer amount.
 * This component is designed to ensure the input format includes a dollar sign ('$') and restricts
 * the entry to valid monetary values. It features a custom style and layout to match the application's
 * design aesthetic and functional requirements.
 *
 * The field automatically formats the input to keep the dollar sign at the beginning and
 * allows only numeric values, commas, and decimal points, enhancing usability and preventing input errors.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TransferAmountInput() {
    var amount by remember { mutableStateOf("$") }

    TextField(
        value = amount,
        onValueChange = { newValue ->
            if (newValue.startsWith("$")) {
                amount = newValue.filter { it.isDigit() || it == ',' || it == '.' || it == '$' }
            } else {
                amount = "$" + newValue.filter { it.isDigit() || it == ',' || it == '.' }
            }
        },
        textStyle = DesignSystem.TextTypography.displayLarge.copy(
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        ),
        singleLine = true,
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        shape = RoundedCornerShape(30.dp),
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color(0xFF1F1750),
            cursorColor = Color(0xFF2DD7AE),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}