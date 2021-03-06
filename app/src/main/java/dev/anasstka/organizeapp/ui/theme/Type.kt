package dev.anasstka.organizeapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    h4 = TextStyle(
        fontFamily = FontInter,
        fontWeight = FontWeight.SemiBold,
        fontSize = 28.sp,
    ),
    h3 = TextStyle(
        fontFamily = FontInter,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
    ),
    h6 = TextStyle(
        fontFamily = FontManrope,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
    ),
    subtitle1 = TextStyle(
        fontFamily = FontInter,
        fontSize = 15.sp,
    ),
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)