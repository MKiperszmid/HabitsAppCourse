package com.mkiperszmid.habitsappcourse.onboarding.domain.repository

interface OnboardingRepository {
    fun hasSeenOnboarding(): Boolean
    fun completeOnboarding()
}
