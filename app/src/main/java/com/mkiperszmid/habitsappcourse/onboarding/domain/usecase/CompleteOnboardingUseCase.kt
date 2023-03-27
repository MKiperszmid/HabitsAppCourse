package com.mkiperszmid.habitsappcourse.onboarding.domain.usecase

import com.mkiperszmid.habitsappcourse.onboarding.domain.repository.OnboardingRepository

class CompleteOnboardingUseCase(
    private val repository: OnboardingRepository
) {
    operator fun invoke() {
        repository.completeOnboarding()
    }
}
