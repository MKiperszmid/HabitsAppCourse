package com.mkiperszmid.home_presentation.home.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeQuote(
    quote: String,
    author: String,
    @DrawableRes imageId: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxWidth().clip(RoundedCornerShape(12.dp)).height(146.dp)
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.align(Alignment.TopEnd).graphicsLayer(
                scaleX = 2.5f,
                scaleY = 2.5f
            ).offset(x = (-12).dp, y = 27.dp)
        )
        Column(
            modifier = Modifier.padding(vertical = 26.dp, horizontal = 16.dp)
                .align(Alignment.TopStart)
                .padding(end = 100.dp)
        ) {
            Text(
                text = quote.uppercase(),
                color = MaterialTheme.colorScheme.tertiary,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "- ${author.uppercase()}",
                color = MaterialTheme.colorScheme.tertiary.copy(
                    alpha = 0.5f
                ),
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
