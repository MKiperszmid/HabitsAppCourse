package com.mkiperszmid.authentication_presentation.signup

sealed interface SignupEvent {
    data class EmailChange(val email: String) : SignupEvent
    data class PasswordChange(val password: String) : SignupEvent
    object LogIn : SignupEvent
    object SignUp : SignupEvent
}
