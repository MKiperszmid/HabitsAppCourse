package com.mkiperszmid.habitsappcourse.authentication.domain.repository

interface AuthenticationRepository {
    suspend fun login(email: String, password: String): Result<Unit>
}
