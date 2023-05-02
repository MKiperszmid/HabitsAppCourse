package com.mkiperszmid.habitsappcourse.home.presentation.detail

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor() : ViewModel() {
    var state by mutableStateOf(DetailState())
        private set

    fun onEvent(event: DetailEvent) {
        when (event) {
            is DetailEvent.FrequencyChange -> {
                val frequency = if (state.frequency.contains(event.dayOfWeek)) {
                    state.frequency - event.dayOfWeek
                } else {
                    state.frequency + event.dayOfWeek
                }
                state = state.copy(
                    frequency = frequency
                )
            }
            DetailEvent.HabitSave -> TODO()
            is DetailEvent.NameChange -> {
                state = state.copy(
                    habitName = event.name
                )
            }
            is DetailEvent.ReminderChange -> {
                state = state.copy(
                    reminder = event.time
                )
            }
        }
    }
}
