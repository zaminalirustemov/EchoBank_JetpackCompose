package com.zaminali.composeApp.presentation.ui.screens.transfers.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

/**
 * Displays a checkbox alongside a text label to prompt users to agree with the Terms and Conditions.
 * This component is commonly used in forms and settings where user consent is required before
 * proceeding with a transaction or action.
 *
 * The checkbox is styled with custom colors to match the application's theme and design standards.
 * The text next to the checkbox explains the action associated with checking the box,
 * reinforcing what the user is agreeing to.
 */
@Composable
fun TermsAndConditionsAgreement() {

    var isChecked by remember { mutableStateOf(true) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {

        Box(
            modifier = Modifier
                .padding(end = 8.dp)
                .size(20.dp)
                .background(color = Color(0xFF2DD7AE), shape = RoundedCornerShape(6.dp)),
            contentAlignment = Alignment.Center
        ) {
            Checkbox(
                checked = isChecked,
                onCheckedChange = { isChecked = it },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Transparent,
                    uncheckedColor = Color.Transparent,
                    checkmarkColor = Color(0xFF1F1750)
                ),
                modifier = Modifier.size(24.dp)
            )
        }


        Text(text = "I agree with ", color = Color.White)
        Text(
            text = "Terms & Conditions",
            color = Color(0xFF2DD7AE),
            fontWeight = FontWeight.Bold
        )
    }
}