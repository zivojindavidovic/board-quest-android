package com.boardquest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.boardquest.navigation.NavGraph
import com.boardquest.ui.components.BottomNavigationBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            Scaffold(
                bottomBar = { BottomNavigationBar(navController) }
            ) { paddingValues ->
                Box(modifier = Modifier.padding(paddingValues)) {
                    NavGraph(navController = navController)
                }
            }
        }
    }
}