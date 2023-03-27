package com.mkiperszmid.habitsappcourse.onboarding.domain.usecase

import com.mkiperszmid.habitsappcourse.onboarding.domain.repository.OnboardingRepository

class HasSeenOnboardingUseCase(
    private val repository: OnboardingRepository
) {
    operator fun invoke(): Boolean {
        return repository.hasSeenOnboarding()
    }
}
