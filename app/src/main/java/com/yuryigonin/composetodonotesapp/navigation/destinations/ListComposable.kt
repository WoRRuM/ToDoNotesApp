package com.yuryigonin.composetodonotesapp.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.yuryigonin.composetodonotesapp.ui.screens.list.ListScreen
import com.yuryigonin.composetodonotesapp.ui.viewmodel.SharedViewModel
import com.yuryigonin.composetodonotesapp.util.Constants.LIST_ARGUMENT_KEY
import com.yuryigonin.composetodonotesapp.util.Constants.LIST_SCREEN

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewModel
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        })
    ) {
        ListScreen(
            navigateToTaskScreen = navigateToTaskScreen,
            sharedViewModel = sharedViewModel
        )

    }
}