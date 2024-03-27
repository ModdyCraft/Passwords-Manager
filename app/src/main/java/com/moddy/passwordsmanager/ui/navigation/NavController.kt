package com.moddy.passwordsmanager.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.moddy.passwordsmanager.ui.screens.auth.login.LoginScreen
import com.moddy.passwordsmanager.ui.screens.auth.signup.SignupScreen

@Composable
fun NavController(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = NavRoutes.Login.name
    ) {
        composable(route = NavRoutes.Login.name) {
            LoginScreen(
                navToForgotPassword = {

                },
                navToSignup = {
                    navController.navigate(NavRoutes.Signup.name) {
                        popUpTo(NavRoutes.Login.name) {
                            inclusive = true
                        }

                        launchSingleTop = true
                    }
                }
            )
        }
        composable(route = NavRoutes.Signup.name) {
            SignupScreen(
                navToLogin = {
                    navController.navigate(NavRoutes.Login.name) {
                        popUpTo(NavRoutes.Signup.name) {
                            inclusive = true
                        }

                        launchSingleTop = true
                    }
                }
            )
        }
    }
}