package com.mkiperszmid.home_presentation.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.ZonedDateTime

@Composable
fun HomeDateItem(
    date: ZonedDateTime,
    isSelected: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .size(52.dp),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
                .size(50.dp)
                .clickable {
                    onClick()
                },
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = date.dayOfWeek.name.take(3),
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.tertiary.copy(
                        alpha = 0.5f
                    ),
                    fontSize = 10.sp
                )
                Text(
                    text = date.dayOfMonth.toString(),
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.tertiary,
                    fontSize = 16.sp
                )
            }
        }
        if (isSelected) {
            Divider(
                thickness = 4.dp,
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(horizontal = 14.dp)
                    .clip(RoundedCornerShape(14.dp)),
                color = MaterialTheme.colorScheme.tertiary
            )
        }
    }
}

@Preview
@Composable
fun HomeDateItemUnselectedPreview() {
    HomeDateItem(date = ZonedDateTime.now(), isSelected = false) {}
}

@Preview
@Composable
fun HomeDateItemSelectedPreview() {
    HomeDateItem(date = ZonedDateTime.now(), isSelected = true) {}
}
