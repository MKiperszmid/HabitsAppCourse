package com.mkiperszmid.habitsappcourse

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.mkiperszmid.habitsappcourse.onboarding.domain.usecase.HasSeenOnboardingUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val hasSeenOnboardingUseCase: HasSeenOnboardingUseCase
) : ViewModel() {
    var hasSeenOnboarding by mutableStateOf(hasSeenOnboardingUseCase())
        private set
}
