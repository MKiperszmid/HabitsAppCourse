package com.mkiperszmid.authentication_presentation.signup

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mkiperszmid.authentication_domain.usecase.SignupUseCases
import com.mkiperszmid.authentication_presentation.util.PasswordErrorParser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignupViewModel @Inject constructor(
    private val signupUseCases: SignupUseCases
) : ViewModel() {
    var state by mutableStateOf(SignupState())
        private set

    fun onEvent(event: SignupEvent) {
        when (event) {
            is SignupEvent.EmailChange -> {
                state = state.copy(
                    email = event.email
                )
            }
            is SignupEvent.PasswordChange -> {
                state = state.copy(
                    password = event.password
                )
            }
            SignupEvent.LogIn -> {
                state = state.copy(
                    logIn = true
                )
            }
            SignupEvent.SignUp -> {
                signUp()
            }
        }
    }

    private fun signUp() {
        state = state.copy(
            emailError = null,
            passwordError = null
        )
        if (!signupUseCases.validateEmailUseCase(state.email)) {
            state = state.copy(
                emailError = "El email no es valido"
            )
        }
        val passwordResult = signupUseCases.validatePasswordUseCase(state.password)
        state = state.copy(
            passwordError = PasswordErrorParser.parseError(passwordResult)
        )

        if (state.emailError == null && state.passwordError == null) {
            state = state.copy(
                isLoading = true
            )
            viewModelScope.launch {
                signupUseCases.signupWithEmailUseCase(state.email, state.password).onSuccess {
                    state = state.copy(
                        isSignedIn = true
                    )
                }.onFailure {
                    state = state.copy(
                        emailError = it.message
                    )
                }
                state = state.copy(
                    isLoading = false
                )
            }
        }
    }
}
