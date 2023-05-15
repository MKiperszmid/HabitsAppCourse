package com.mkiperszmid.habitsappcourse.authentication.domain.usecase

class ValidatePasswordUseCase {
    operator fun invoke(password: String): PasswordResult {
        if (password.length < 8) {
            return PasswordResult.INVALID_LENGTH
        }

        if (!password.any { it.isLowerCase() }) {
            return PasswordResult.INVALID_LOWERCASE
        }

        if (!password.any { it.isUpperCase() }) {
            return PasswordResult.INVALID_UPPERCASE
        }

        if (!password.any { it.isDigit() }) {
            return PasswordResult.INVALID_DIGITS
        }
        return PasswordResult.VALID
    }
}

enum class PasswordResult {
    VALID,
    INVALID_LOWERCASE,
    INVALID_UPPERCASE,
    INVALID_DIGITS,
    INVALID_LENGTH
}
