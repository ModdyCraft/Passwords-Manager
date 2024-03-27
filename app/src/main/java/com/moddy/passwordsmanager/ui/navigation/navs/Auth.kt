package com.moddy.passwordsmanager.ui.navigation.navs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.moddy.passwordsmanager.ui.navigation.NavRoutes
import com.moddy.passwordsmanager.ui.screens.auth.login.LoginScreen
import com.moddy.passwordsmanager.ui.screens.auth.signup.SignupScreen

fun NavGraphBuilder.Auth(
    navController: NavHostController
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