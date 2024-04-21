package com.mkiperszmid.habitsappcourse.home.data.repository

import com.mkiperszmid.home_domain.models.Habit
import com.mkiperszmid.home_domain.repository.HomeRepository
import kotlinx.coroutines.flow.MutableSharedFlow
import java.time.ZonedDateTime

class FakeHomeRepository : com.mkiperszmid.home_domain.repository.HomeRepository {
    private var habits = emptyList<com.mkiperszmid.home_domain.models.Habit>()
    private val habitsFlow = MutableSharedFlow<List<com.mkiperszmid.home_domain.models.Habit>>()

    override fun getAllHabitsForSelectedDate(date: ZonedDateTime) = habitsFlow

    override suspend fun insertHabit(habit: com.mkiperszmid.home_domain.models.Habit) {
        habits = habits + habit
        habitsFlow.emit(habits)
    }

    override suspend fun getHabitById(id: String) = habits.first { id == it.id }

    override suspend fun syncHabits() {}
}
