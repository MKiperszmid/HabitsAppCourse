package com.mkiperszmid.habitsappcourse.home.domain.detail.usecase

import com.mkiperszmid.habitsappcourse.home.domain.models.Habit
import com.mkiperszmid.habitsappcourse.home.domain.repository.HomeRepository

class GetHabitByIdUseCase(
    private val repository: HomeRepository
) {
    suspend operator fun invoke(id: String): Habit {
        return repository.getHabitById(id)
    }
}
