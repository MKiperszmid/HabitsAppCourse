package com.mkiperszmid.home_domain.home.usecase

import com.mkiperszmid.home_domain.models.Habit
import com.mkiperszmid.home_domain.repository.HomeRepository
import java.time.ZonedDateTime

class CompleteHabitUseCase(private val repository: HomeRepository) {
    suspend operator fun invoke(habit: Habit, date: ZonedDateTime) {
        val newHabit = if (habit.completedDates.contains(date.toLocalDate())) {
            habit.copy(
                completedDates = habit.completedDates - date.toLocalDate()
            )
        } else {
            habit.copy(
                completedDates = habit.completedDates + date.toLocalDate()
            )
        }
        repository.insertHabit(newHabit)
    }
}
