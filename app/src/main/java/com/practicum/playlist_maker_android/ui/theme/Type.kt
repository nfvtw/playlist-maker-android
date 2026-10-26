package com.practicum.playlist_maker_android.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.practicum.playlist_maker_android.R

val YsDisplayFamily = FontFamily(
    Font(R.font.ys_display_regular, FontWeight.Normal),   // 400
    Font(R.font.ys_display_bold, FontWeight.Bold),        // 700
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = YsDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = YsDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = YsDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    ),
    titleLarge = TextStyle(
        fontFamily = YsDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = YsDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = YsDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),
    labelLarge = TextStyle(
        fontFamily = YsDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = YsDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = YsDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 11.sp,
    ),
    headlineLarge = TextStyle(
        fontFamily = YsDisplayFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
    ),
    headlineMedium = TextStyle(
        fontFamily = YsDisplayFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
    ),
    headlineSmall = TextStyle(
        fontFamily = YsDisplayFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
    ),
)