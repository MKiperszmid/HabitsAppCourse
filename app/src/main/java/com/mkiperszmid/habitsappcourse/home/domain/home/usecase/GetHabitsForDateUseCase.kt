package com.mkiperszmid.habitsappcourse.home.domain.home.usecase

import com.mkiperszmid.habitsappcourse.home.domain.models.Habit
import com.mkiperszmid.habitsappcourse.home.domain.repository.HomeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map
import java.time.ZonedDateTime

class GetHabitsForDateUseCase(
    private val repository: HomeRepository
) {
    operator fun invoke(date: ZonedDateTime): Flow<List<Habit>> {
        return repository.getAllHabitsForSelectedDate(date).distinctUntilChanged().map {
            it.filter { it.frequency.contains(date.dayOfWeek) }
        }
    }
}
