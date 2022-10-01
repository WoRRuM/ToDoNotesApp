package com.yuryigonin.composetodonotesapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val topAppBarColor = Color(0xFF051367)

val LightGray = Color(0xFFFCFCFC)
val MediumGray = Color(0xFF9C9C9C)
val DarkGray = Color(0xFF141414)

val LowPriorityColor = Color(0xFF00C980)
val HighPriorityColor = Color(0xFFFF4646)
val MediumPriorityColor = Color(0xFFFFC114)
val NonePriorityColor = MediumGray


val ButtonLightThemeColor = Color(0xFF2D31FA)
val ButtonDarkThemeColor = Color(0xFFfe8c05)

val Colors.taskItemTextColor: Color
    @Composable
    get() = if (isLight) DarkGray else LightGray

val Colors.taskItemBackgroundColor: Color
    @Composable
    get() = if (isLight) Color.White else DarkGray

val Colors.fabBackgroundColor: Color
    @Composable
    get() = if(isLight) ButtonLightThemeColor else ButtonDarkThemeColor

val Colors.topAppBarContentColor: Color
    @Composable
    get() = if(isLight) Color.White else Color.LightGray

val Colors.topAppBarBackgroundColor: Color
    @Composable
    get() = if(isLight) topAppBarColor else Color.Black
