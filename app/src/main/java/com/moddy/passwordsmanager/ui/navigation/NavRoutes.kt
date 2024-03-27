package com.moddy.passwordsmanager.ui.navigation

import androidx.annotation.StringRes
import com.moddy.passwordsmanager.R

enum class NavRoutes(
    @StringRes title: Int
) {
    Login(R.string.ls_login),
    Signup(R.string.ss_signup)
}