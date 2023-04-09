package com.mkiperszmid.habitsappcourse.authentication.domain.usecase

import com.mkiperszmid.habitsappcourse.authentication.domain.repository.AuthenticationRepository

class GetUserIdUseCase(private val repository: AuthenticationRepository) {
    operator fun invoke(): String? {
        return repository.getUserId()
    }
}