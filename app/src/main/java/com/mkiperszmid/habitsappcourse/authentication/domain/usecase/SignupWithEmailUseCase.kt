package com.mkiperszmid.habitsappcourse.authentication.domain.usecase

import com.mkiperszmid.habitsappcourse.authentication.domain.repository.AuthenticationRepository

class SignupWithEmailUseCase(private val repository: AuthenticationRepository) {
    suspend operator fun invoke(email: String, password: String): Result<Unit> {
        return repository.signup(email, password)
    }
}
