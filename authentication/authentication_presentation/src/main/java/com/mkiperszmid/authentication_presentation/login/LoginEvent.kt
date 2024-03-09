package com.mkiperszmid.authentication_presentation.login

sealed interface LoginEvent {
    data class EmailChange(val email: String) : LoginEvent
    data class PasswordChange(val password: String) : LoginEvent
    object Login : LoginEvent
}
