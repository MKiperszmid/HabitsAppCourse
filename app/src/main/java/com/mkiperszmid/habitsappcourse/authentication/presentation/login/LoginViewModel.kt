package com.mkiperszmid.habitsappcourse.authentication.presentation.login

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mkiperszmid.habitsappcourse.authentication.domain.repository.AuthenticationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val authenticationRepository: AuthenticationRepository) :
    ViewModel() {
    var state by mutableStateOf(LoginState())
        private set

    fun onEvent(event: LoginEvent) {
        when (event) {
            is LoginEvent.EmailChange -> {
                state = state.copy(
                    email = event.email
                )
            }
            LoginEvent.Login -> {
                login()
            }
            is LoginEvent.PasswordChange -> {
                state = state.copy(
                    password = event.password
                )
            }
            LoginEvent.SignUp -> {
                state = state.copy(
                    signUp = true
                )
            }
        }
    }

    private fun login() {
        viewModelScope.launch {
            authenticationRepository.login(state.email, state.password).onSuccess {
                println()
            }.onFailure {
                val error = it.message
                println(error)
            }
        }
    }
}
