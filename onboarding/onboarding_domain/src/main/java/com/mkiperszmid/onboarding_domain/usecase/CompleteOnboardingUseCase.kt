package com.mkiperszmid.onboarding_domain.usecase

import com.mkiperszmid.onboarding_domain.repository.OnboardingRepository

class CompleteOnboardingUseCase(
    private val repository: OnboardingRepository
) {
    operator fun invoke() {
        repository.completeOnboarding()
    }
}
