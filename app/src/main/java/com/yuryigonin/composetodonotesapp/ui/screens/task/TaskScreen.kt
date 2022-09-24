package com.yuryigonin.composetodonotesapp.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.yuryigonin.composetodonotesapp.ui.screens.list.TaskItem
import com.yuryigonin.composetodonotesapp.util.Action

@Composable
fun TaskScreen(
    navigateToListScreen: (Action) -> Unit
) {


    Scaffold(
        topBar = {
            TaskAppBar(navigateToListScreen = navigateToListScreen)
        },
        content = {}
    )
}