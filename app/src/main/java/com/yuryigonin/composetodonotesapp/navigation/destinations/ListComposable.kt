package com.yuryigonin.composetodonotesapp.navigation.destinations

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.yuryigonin.composetodonotesapp.ui.screens.list.ListScreen
import com.yuryigonin.composetodonotesapp.ui.viewmodel.SharedViewModel
import com.yuryigonin.composetodonotesapp.util.Constants.LIST_ARGUMENT_KEY
import com.yuryigonin.composetodonotesapp.util.Constants.LIST_SCREEN
import com.yuryigonin.composetodonotesapp.util.toAction

@ExperimentalMaterialApi
fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewModel
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        })
    ) { navBackStackEntry ->
        val action = navBackStackEntry.arguments?.getString(LIST_ARGUMENT_KEY).toAction()
        
        LaunchedEffect(key1 = action) {
            sharedViewModel.action.value = action
        }

        ListScreen(
            navigateToTaskScreen = navigateToTaskScreen,
            sharedViewModel = sharedViewModel
        )

    }
}
