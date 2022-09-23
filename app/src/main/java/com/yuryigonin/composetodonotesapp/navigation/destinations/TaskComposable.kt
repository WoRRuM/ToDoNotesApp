package com.yuryigonin.composetodonotesapp.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.yuryigonin.composetodonotesapp.ui.screens.task.TaskScreen
import com.yuryigonin.composetodonotesapp.util.Action
import com.yuryigonin.composetodonotesapp.util.Constants
import com.yuryigonin.composetodonotesapp.util.Constants.TASK_ARGUMENT_KEY

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = Constants.TASK_SCREEN,
        arguments = listOf(navArgument(Constants.TASK_ARGUMENT_KEY){
            type = NavType.IntType
        })
    ) { navBackStackEntry ->
        val taskId = navBackStackEntry.arguments!!.getInt(TASK_ARGUMENT_KEY)
        
        TaskScreen(navigateToListScreen = navigateToListScreen)
    }
}