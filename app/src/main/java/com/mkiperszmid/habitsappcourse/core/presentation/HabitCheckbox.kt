package com.mkiperszmid.habitsappcourse.core.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HabitCheckbox(
    isChecked: Boolean,
    modifier: Modifier = Modifier,
    onCheckedChange: () -> Unit
) {
    val backgroundColor =
        if (isChecked) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.background

    Box(
        modifier = modifier
            .size(35.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(color = backgroundColor)
            .clickable {
                onCheckedChange()
            },
        contentAlignment = Alignment.Center
    ) {
        if (isChecked) {
            Icon(
                imageVector = Icons.Default.Check,
                contentDescription = "checked",
                tint = MaterialTheme.colorScheme.tertiary
            )
        }
    }
}

@Preview
@Composable
fun HabitCheckboxCheckedPreview() {
    HabitCheckbox(
        isChecked = true
    ) {}
}

@Preview
@Composable
fun HabitCheckboxUncheckedPreview() {
    HabitCheckbox(
        isChecked = false
    ) {}
}
