package com.mkiperszmid.habitsappcourse.authentication.domain.usecase

class ValidatePasswordUseCase {
    operator fun invoke(password: String): PasswordResult {
        if (password.length < 8) {
            return PasswordResult.Invalid("La contraseña tiene que tener al menos 8 caracteres")
        }

        if (!password.any { it.isLowerCase() }) {
            return PasswordResult.Invalid("La contraseña tiene que tener al menos 1 caracter en minuscula")
        }

        if (!password.any { it.isUpperCase() }) {
            return PasswordResult.Invalid("La contraseña tiene que tener al menos 1 caracter en mayuscula")
        }

        if (!password.any { it.isDigit() }) {
            return PasswordResult.Invalid("La contraseña tiene que tener al menos 1 numero")
        }
        return PasswordResult.Valid
    }
}

sealed class PasswordResult {
    object Valid : PasswordResult()
    data class Invalid(val errorMessage: String) : PasswordResult()
}
