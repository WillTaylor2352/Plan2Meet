package com.plan2meet.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.plan2meet.ui.*

@Composable
fun DayOfWeekText(dayOfWeekChar: Char){

    Text(
        text = dayOfWeekChar.toString(),
        modifier = Modifier.size(width = dateWidth.dp, height = (dateHeight/2).dp)
            .background(AppPurple, Rectangle),
        color = White,
        textAlign = TextAlign.Center
    )
}