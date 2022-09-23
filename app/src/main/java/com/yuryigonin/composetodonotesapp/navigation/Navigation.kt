package com.yuryigonin.composetodonotesapp.navigation

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.yuryigonin.composetodonotesapp.navigation.destinations.listComposable
import com.yuryigonin.composetodonotesapp.navigation.destinations.taskComposable
import com.yuryigonin.composetodonotesapp.ui.viewmodel.SharedViewModel
import com.yuryigonin.composetodonotesapp.util.Constants.LIST_SCREEN

@ExperimentalMaterialApi
@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }
    
    NavHost(navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task,
            sharedViewModel = sharedViewModel
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }
}