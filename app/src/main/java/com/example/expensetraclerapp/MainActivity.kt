package com.example.expensetraclerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.expensetraclerapp.UIDesign.EntryScreen
import com.example.expensetraclerapp.UIDesign.MainScreen
import com.example.expensetraclerapp.UIDesign.Settings
import com.example.expensetraclerapp.ui.theme.ExpenseTraclerAppTheme

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

    NavHost(navController, startDestination = "EntryScreen") {
        composable("EntryScreen") { EntryScreen(navController) }
        composable("MainScreen") { MainScreen(navController) }
        composable("Settings") { Settings(navController) }
    }
}