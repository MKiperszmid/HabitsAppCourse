package com.mkiperszmid.home_domain.detail.usecase

import com.mkiperszmid.home_domain.models.Habit
import com.mkiperszmid.home_domain.repository.HomeRepository

class InsertHabitUseCase(private val repository: HomeRepository) {
    suspend operator fun invoke(habit: Habit) {
        repository.insertHabit(habit)
    }
}
