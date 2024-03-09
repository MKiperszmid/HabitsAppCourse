package com.mkiperszmid.habitsappcourse.authentication.domain.usecase

import com.mkiperszmid.authentication_domain.usecase.PasswordResult
import com.mkiperszmid.authentication_domain.usecase.ValidatePasswordUseCase
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class ValidatePasswordUseCaseTest {
    private lateinit var validatePasswordUseCase: ValidatePasswordUseCase

    @Before
    fun setup() {
        validatePasswordUseCase = ValidatePasswordUseCase()
    }

    @Test
    fun `given low character password, return invalid password`() {
        val input = "asd"
        val result = validatePasswordUseCase(input)

        assertEquals(
            PasswordResult.INVALID_LENGTH,
            result
        )
    }

    @Test
    fun `given no lowercase password, return invalid password`() {
        val input = "ASDASDASD"
        val result = validatePasswordUseCase(input)

        assertEquals(
            PasswordResult.INVALID_LOWERCASE,
            result
        )
    }

    @Test
    fun `given no uppercase password, return invalid password`() {
        val input = "asdasdasd"
        val result = validatePasswordUseCase(input)

        assertEquals(
            PasswordResult.INVALID_UPPERCASE,
            result
        )
    }

    @Test
    fun `given no numbered password, return invalid password`() {
        val input = "ASDASDASDasdasdasd"
        val result = validatePasswordUseCase(input)

        assertEquals(
            PasswordResult.INVALID_DIGITS,
            result
        )
    }

    @Test
    fun `given invalid password, return invalid password`() {
        val input = "password123"
        val result = validatePasswordUseCase(input)

        assertEquals(
            PasswordResult.INVALID_UPPERCASE,
            result
        )
    }

    @Test
    fun `given invalid password with no uppercase, return invalid password`() {
        val input = "123fjk9013j-1i3f01j3f"
        val result = validatePasswordUseCase(input)

        assertEquals(
            PasswordResult.INVALID_UPPERCASE,
            result
        )
    }

    @Test
    fun `given valid password, return valid`() {
        val input = "asdASD123"
        val result = validatePasswordUseCase(input)

        assertEquals(
            PasswordResult.VALID,
            result
        )
    }
}
