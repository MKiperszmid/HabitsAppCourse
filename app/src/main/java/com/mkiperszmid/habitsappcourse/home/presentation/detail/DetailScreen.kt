package com.mkiperszmid.habitsappcourse.home.presentation.detail

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.maxkeppeler.sheets.clock.ClockDialog
import com.maxkeppeler.sheets.clock.models.ClockConfig
import com.maxkeppeler.sheets.clock.models.ClockSelection
import com.mkiperszmid.habitsappcourse.core.presentation.HabitTextfield
import com.mkiperszmid.habitsappcourse.home.presentation.detail.components.DetailFrequency
import com.mkiperszmid.habitsappcourse.home.presentation.detail.components.DetailReminder
import java.time.LocalTime

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    onBack: () -> Unit,
    onSave: () -> Unit,
    viewModel: DetailViewModel = hiltViewModel()
) {
    val state = viewModel.state

    LaunchedEffect(state.isSaved) {
        if (state.isSaved) {
            onSave()
        }
    }

    val clockState = com.maxkeppeker.sheets.core.models.base.rememberSheetState()
    ClockDialog(
        state = clockState,
        selection = ClockSelection.HoursMinutes { hours, minutes ->
            viewModel.onEvent(DetailEvent.ReminderChange(LocalTime.of(hours, minutes)))
        },
        config = ClockConfig(
            defaultTime = state.reminder,
            is24HourFormat = true
        )
    )

    Scaffold(modifier = Modifier.fillMaxSize(), topBar = {
        CenterAlignedTopAppBar(title = {
            Text(text = "New Habit")
        }, navigationIcon = {
                IconButton(onClick = onBack) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "back")
                }
            })
    }) {
        Column(
            modifier = Modifier.fillMaxSize().padding(it).padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            HabitTextfield(
                value = state.habitName,
                onValueChange = { viewModel.onEvent(DetailEvent.NameChange(it)) },
                placeholder = "New habit",
                contentDescription = "Enter habit name",
                modifier = Modifier.fillMaxWidth(),
                backgroundColor = Color.White,
                keyboardOptions = KeyboardOptions(
                    autoCorrect = false,
                    imeAction = ImeAction.Done
                ),
                keyboardActions = KeyboardActions {
                    viewModel.onEvent(DetailEvent.HabitSave)
                }
            )
            DetailFrequency(
                selectedDays = state.frequency,
                onFrequencyChange = {
                    viewModel.onEvent(DetailEvent.FrequencyChange(it))
                }
            )
            DetailReminder(reminder = state.reminder, onTimeClick = { clockState.show() })
        }
    }
}
