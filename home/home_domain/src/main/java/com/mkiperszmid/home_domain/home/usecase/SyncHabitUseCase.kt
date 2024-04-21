package com.mkiperszmid.home_domain.home.usecase

import com.mkiperszmid.home_domain.repository.HomeRepository

class SyncHabitUseCase(private val repository: HomeRepository) {
    suspend operator fun invoke() {
        repository.syncHabits()
    }
}