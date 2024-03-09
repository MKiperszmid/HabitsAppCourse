package com.mkiperszmid.onboarding_domain.usecase

import com.mkiperszmid.onboarding_domain.repository.OnboardingRepository

class HasSeenOnboardingUseCase(
    private val repository: OnboardingRepository
) {
    operator fun invoke(): Boolean {
        return repository.hasSeenOnboarding()
    }
}
