package com.mkiperszmid.habitsappcourse.authentication.domain.usecase

data class SignupUseCases(
    val signupWithEmailUseCase: SignupWithEmailUseCase,
    val validatePasswordUseCase: ValidatePasswordUseCase,
    val validateEmailUseCase: ValidateEmailUseCase
)
