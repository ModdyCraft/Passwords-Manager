package com.moddy.passwordsmanager.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.moddy.passwordsmanager.ui.screens.auth.login.LoginScreen

@Composable
fun NavController(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = NavRoutes.Login.name
    ) {
        composable(route = NavRoutes.Login.name) {
            LoginScreen()
        }
    }
}