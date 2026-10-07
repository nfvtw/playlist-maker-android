package com.practicum.playlist_maker_android.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80,
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40,
)

@Composable
fun PlaylistmakerandroidTheme(
    darkTheme: Boolean = false,     // тёмную пока не поддерживаем
    dynamicColor: Boolean = false,  // ВАЖНО: отключаем
    content: @Composable () -> Unit,
) {
    // Всегда используем светлую схему — наши цвета из Color.kt
    val colorScheme = LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content,
    )
}