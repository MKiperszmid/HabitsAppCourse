package com.mkiperszmid.habitsappcourse.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.mkiperszmid.authentication_presentation.login.LoginScreen
import com.mkiperszmid.authentication_presentation.signup.SignupScreen
import com.mkiperszmid.home_presentation.detail.DetailScreen
import com.mkiperszmid.home_presentation.home.HomeScreen
import com.mkiperszmid.onboarding_presentation.OnboardingScreen

@Composable
fun NavigationHost(
    navHostController: NavHostController,
    startDestination: NavigationRoute,
    logout: () -> Unit
) {
    NavHost(navController = navHostController, startDestination = startDestination.route) {
        composable(NavigationRoute.Onboarding.route) {
            com.mkiperszmid.onboarding_presentation.OnboardingScreen(
                onFinish = {
                    navHostController.popBackStack()
                    navHostController.navigate(NavigationRoute.Login.route)
                }
            )
        }
        composable(NavigationRoute.Login.route) {
            com.mkiperszmid.authentication_presentation.login.LoginScreen(onLogin = {
                navHostController.popBackStack()
                navHostController.navigate(NavigationRoute.Home.route)
            }, onSignUp = {
                navHostController.navigate(NavigationRoute.Signup.route)
            })
        }

        composable(NavigationRoute.Signup.route) {
            com.mkiperszmid.authentication_presentation.signup.SignupScreen(onSignIn = {
                navHostController.navigate(NavigationRoute.Home.route) {
                    popUpTo(navHostController.graph.id) {
                        inclusive = true
                    }
                }
            }, onLogin = {
                navHostController.popBackStack()
            })
        }

        composable(NavigationRoute.Home.route) {
            com.mkiperszmid.home_presentation.home.HomeScreen(onNewHabit = {
                navHostController.navigate(NavigationRoute.Detail.route)
            }, onSettings = {
                navHostController.navigate(NavigationRoute.Settings.route)
            }, onEditHabit = {
                navHostController.navigate(NavigationRoute.Detail.route + "?habitId=$it")
            })
        }

        composable(
            NavigationRoute.Detail.route + "?habitId={habitId}",
            arguments = listOf(
                navArgument("habitId") {
                    type = NavType.StringType
                    nullable = true
                    defaultValue = null
                }
            )
        ) {
            com.mkiperszmid.home_presentation.detail.DetailScreen(onBack = {
                navHostController.popBackStack()
            }, onSave = {
                navHostController.popBackStack()
            })
        }

        composable(NavigationRoute.Settings.route) {
            com.mkiperszmid.settings_presentation.SettingsScreen(
                onBack = {
                    navHostController.popBackStack()
                },
                onLogout = {
                    logout()
                    navHostController.navigate(NavigationRoute.Login.route) {
                        popUpTo(navHostController.graph.id) {
                            inclusive = true
                        }
                    }
                }
            )
        }
    }
}
