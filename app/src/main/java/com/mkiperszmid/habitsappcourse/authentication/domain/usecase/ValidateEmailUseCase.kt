package com.mkiperszmid.habitsappcourse.authentication.domain.usecase

import com.mkiperszmid.habitsappcourse.authentication.domain.matcher.EmailMatcher

class ValidateEmailUseCase(private val emailMatcher: EmailMatcher) {
    operator fun invoke(email: String): Boolean {
        return emailMatcher.isValid(email)
    }
}
