package com.boardquest.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Group
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomNavItem("home", "Početna", Icons.Default.Home)
    object Games : BottomNavItem("games", "Igre", Icons.Default.SportsEsports)
    object Map : BottomNavItem("map", "Mapa", Icons.Default.Map)
    object Clubs : BottomNavItem("clubs", "Klubovi", Icons.Default.Group)
    object Profile : BottomNavItem("profile", "Profil", Icons.Default.Person)
}