package com.mkiperszmid.home_domain.detail.usecase

import com.mkiperszmid.home_domain.models.Habit
import com.mkiperszmid.home_domain.repository.HomeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GetHabitByIdUseCase(
    private val repository: HomeRepository
) {
    suspend operator fun invoke(id: String): Habit {
        return withContext(Dispatchers.IO) {
            repository.getHabitById(id)
        }
    }
}
