package com.mkiperszmid.habitsappcourse.navigation

sealed class NavigationRoute(val route: String) {
    object Onboarding : NavigationRoute("onboarding")
    object Login : NavigationRoute("login")
    object Signup : NavigationRoute("signup")
    object Home : NavigationRoute("home")
}
