package com.boardquest.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.boardquest.ui.screens.ClubsScreen
import com.boardquest.ui.screens.GamesScreen
import com.boardquest.ui.screens.HomeScreen
import com.boardquest.ui.screens.MapScreen
import com.boardquest.ui.screens.ProfileScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.Home.route
    ) {
        composable(BottomNavItem.Home.route) { HomeScreen() }
        composable(BottomNavItem.Games.route) { GamesScreen() }
        composable(BottomNavItem.Map.route) { MapScreen() }
        composable(BottomNavItem.Clubs.route) { ClubsScreen() }
        composable(BottomNavItem.Profile.route) { ProfileScreen() }
    }
}