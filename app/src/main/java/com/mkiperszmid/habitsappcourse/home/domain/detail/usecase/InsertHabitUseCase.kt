package com.mkiperszmid.habitsappcourse.home.domain.detail.usecase

import com.mkiperszmid.habitsappcourse.home.domain.models.Habit
import com.mkiperszmid.habitsappcourse.home.domain.repository.HomeRepository

class InsertHabitUseCase(private val repository: HomeRepository) {
    suspend operator fun invoke(habit: Habit) {
        repository.insertHabit(habit)
    }
}
