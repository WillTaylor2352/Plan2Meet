package com.plan2meet.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val defaultPadding: Dp = 0.dp

private val LightColorPalette = lightColors(
    primary = AppPurple,
    primaryVariant = DarkPurple,
    background = White,
    surface = White
)

@Composable
fun Plan2MeetTheme(content: @Composable () -> Unit) {
    val colors = LightColorPalette

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}