package com.example.splitify

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.splitify.presentation.ExpenseCategoryScreen
import com.example.splitify.presentation.ExpenseHistoryScreen
import com.example.splitify.presentation.GroupExpenseScreen
import com.example.splitify.presentation.HamburgerScreen
import com.example.splitify.presentation.HomeScreen
import com.example.splitify.presentation.PersonalExpenseHistory
import com.example.splitify.ui.theme.SplitifyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplitifyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "HomeScreen") {
                        composable("HomeScreen"){
                    HomeScreen(navController)
                        }
                        composable("ExpenseCat"){
                            ExpenseCategoryScreen(navController = navController)
                        }
                        composable("ExpenseScreen"){
                            GroupExpenseScreen(navController = navController)
                        }
                        composable("ExpenseHistory"){
                            ExpenseHistoryScreen()
                        }
                        composable("PersonalExpenseHistory"){
                            PersonalExpenseHistory()
                        }
                        composable("HamburgerScreen"){
                            HamburgerScreen()
                        }
                    }

                }
            }
        }
    }
}
