package com.yuryigonin.composetodonotesapp.data.models

import androidx.compose.ui.graphics.Color
import com.yuryigonin.composetodonotesapp.ui.theme.HighPriorityColor
import com.yuryigonin.composetodonotesapp.ui.theme.LowPriorityColor
import com.yuryigonin.composetodonotesapp.ui.theme.MediumPriorityColor
import com.yuryigonin.composetodonotesapp.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}