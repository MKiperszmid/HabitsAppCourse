package com.mkiperszmid.authentication_domain.usecase

import com.mkiperszmid.authentication_domain.repository.AuthenticationRepository

class LogoutUseCase(private val repository: AuthenticationRepository) {
    suspend operator fun invoke() {
        return repository.logout()
    }
}
