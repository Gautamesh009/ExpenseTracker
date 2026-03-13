package com.example.expensetraclerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.expensetraclerapp.UIDesign.EntryScreen
import com.example.expensetraclerapp.UIDesign.MainScreen
import com.example.expensetraclerapp.UIDesign.Settings
import com.example.expensetraclerapp.ViewModel.TrackerViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Navigation()
        }
    }
}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val viewModel : TrackerViewModel = viewModel(factory = TrackerViewModel.Factory )

    NavHost(navController, startDestination = "EntryScreen") {
        composable("EntryScreen") { EntryScreen(navController) }
        composable("MainScreen") { MainScreen(navController, viewModel) }
        composable("Settings") { Settings(navController, viewModel) }
    }
}