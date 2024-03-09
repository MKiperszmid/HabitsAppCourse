package com.mkiperszmid.habitsappcourse.home

import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.test.platform.app.InstrumentationRegistry
import androidx.work.Configuration
import androidx.work.testing.SynchronousExecutor
import androidx.work.testing.WorkManagerTestInitHelper
import com.mkiperszmid.habitsappcourse.MainActivity
import com.mkiperszmid.habitsappcourse.home.data.repository.FakeHomeRepository
import com.mkiperszmid.home_domain.detail.usecase.DetailUseCases
import com.mkiperszmid.home_domain.detail.usecase.GetHabitByIdUseCase
import com.mkiperszmid.home_domain.detail.usecase.InsertHabitUseCase
import com.mkiperszmid.home_domain.home.usecase.CompleteHabitUseCase
import com.mkiperszmid.home_domain.home.usecase.GetHabitsForDateUseCase
import com.mkiperszmid.home_domain.home.usecase.HomeUseCases
import com.mkiperszmid.home_domain.home.usecase.SyncHabitUseCase
import com.mkiperszmid.home_presentation.detail.DetailScreen
import com.mkiperszmid.home_presentation.detail.DetailViewModel
import com.mkiperszmid.home_presentation.home.HomeScreen
import com.mkiperszmid.home_presentation.home.HomeViewModel
import com.mkiperszmid.habitsappcourse.navigation.NavigationRoute
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.time.LocalDate

@HiltAndroidTest
class CreateHabitE2E {

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @get:Rule
    val composeRule = createAndroidComposeRule<MainActivity>()

    private lateinit var homeRepository: FakeHomeRepository
    private lateinit var homeViewModel: HomeViewModel
    private lateinit var detailViewModel: DetailViewModel
    private lateinit var navController: NavHostController

    @Before
    fun setup() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val config = Configuration.Builder().setMinimumLoggingLevel(Log.DEBUG)
            .setExecutor(SynchronousExecutor())
            .build()
        WorkManagerTestInitHelper.initializeTestWorkManager(context, config)
        homeRepository = FakeHomeRepository()
        val usecases = HomeUseCases(
            completeHabitUseCase = CompleteHabitUseCase(homeRepository),
            getHabitsForDateUseCase = GetHabitsForDateUseCase(homeRepository),
            syncHabitUseCase = SyncHabitUseCase(homeRepository)
        )
        homeViewModel = HomeViewModel(usecases)

        val detailUseCase = DetailUseCases(
            getHabitByIdUseCase = GetHabitByIdUseCase(homeRepository),
            insertHabitUseCase = InsertHabitUseCase(homeRepository)
        )
        detailViewModel = DetailViewModel(SavedStateHandle(), detailUseCase)

        composeRule.activity.setContent {
            navController = rememberNavController()
            NavHost(navController = navController, startDestination = NavigationRoute.Home.route) {
                composable(NavigationRoute.Home.route) {
                    HomeScreen(
                        onNewHabit = {
                            navController.navigate(NavigationRoute.Detail.route)
                        },
                        onSettings = {
                            navController.navigate(NavigationRoute.Settings.route)
                        },
                        onEditHabit = {
                            navController.navigate(NavigationRoute.Detail.route + "?habitId=$it")
                        },
                        viewModel = homeViewModel
                    )
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
                    DetailScreen(
                        onBack = {
                            navController.popBackStack()
                        },
                        onSave = {
                            navController.popBackStack()
                        },
                        viewModel = detailViewModel
                    )
                }
            }
        }
    }

    @Test
    fun createHabit() {
        val habitToCreate = "Vamos al Gym"
        composeRule.onNodeWithText("Home").assertIsDisplayed()
        composeRule.onNodeWithText(habitToCreate).assertDoesNotExist()
        composeRule.onNodeWithContentDescription("Add a new habit").performClick()
        assert(navController.currentDestination?.route?.startsWith(NavigationRoute.Detail.route) == true)
        composeRule.onNodeWithText("New Habit").assertIsDisplayed()
        composeRule.onNodeWithContentDescription("Enter habit name").performClick()
            .performTextInput(habitToCreate)
        val today = LocalDate.now().dayOfWeek
        composeRule.onNodeWithContentDescription(today.name).performClick()
        composeRule.onNodeWithContentDescription("Enter habit name").performImeAction()
        composeRule.onNodeWithText("Home").assertIsDisplayed()
        assert(navController.currentDestination?.route?.startsWith(NavigationRoute.Home.route) == true)
        composeRule.onNodeWithText(habitToCreate).assertIsDisplayed()
    }
}
