package com.practicum.playlist_maker_android.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.practicum.playlist_maker_android.ui.main.MainScreen
import com.practicum.playlist_maker_android.ui.search.SearchScreen
import com.practicum.playlist_maker_android.ui.settings.SettingsScreen

@Composable
fun PlaylistHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.MAIN.route,
    ) {
        composable(Screen.MAIN.route) {
            MainScreen(
                onSearchClick = { navController.navigateToSearch() },
                onSettingsClick = { navController.navigateToSettings() },
            )
        }

        composable(Screen.SEARCH.route) {
            SearchScreen(
                onBackClick = { navController.popBackStack() },
            )
        }

        composable(Screen.SETTINGS.route) {
            SettingsScreen(
                onBackClick = { navController.popBackStack() },
            )
        }
    }
}

private fun NavController.navigateToSearch() {
    navigate(Screen.SEARCH.route)
}

private fun NavController.navigateToSettings() {
    navigate(Screen.SETTINGS.route)
}