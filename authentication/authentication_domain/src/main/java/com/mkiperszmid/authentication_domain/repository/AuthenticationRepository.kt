package com.mkiperszmid.authentication_domain.repository

interface AuthenticationRepository {
    suspend fun login(email: String, password: String): Result<Unit>
    suspend fun signup(email: String, password: String): Result<Unit>
    fun getUserId(): String?

    suspend fun logout()
}
