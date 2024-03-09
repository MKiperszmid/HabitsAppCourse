package com.mkiperszmid.onboarding_presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.mkiperszmid.onboarding_domain.usecase.CompleteOnboardingUseCase
import com.mkiperszmid.onboarding_domain.usecase.HasSeenOnboardingUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OnboardingViewModel @Inject constructor(
    private val hasSeenOnboardingUseCase: HasSeenOnboardingUseCase,
    private val completeOnboardingUseCase: CompleteOnboardingUseCase
) : ViewModel() {
    var hasSeenOnboarding by mutableStateOf(hasSeenOnboardingUseCase())
        private set

    fun completeOnboarding() {
        completeOnboardingUseCase()
        hasSeenOnboarding = true
    }
}
