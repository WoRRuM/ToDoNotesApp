package com.yuryigonin.composetodonotesapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.yuryigonin.composetodonotesapp.navigation.destinations.listComposable
import com.yuryigonin.composetodonotesapp.navigation.destinations.taskComposable
import com.yuryigonin.composetodonotesapp.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
    navController: NavHostController
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }
    
    NavHost(navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task
        )
        taskComposable(
            navigateToTaskScreen = screen.list
        )
    }
}