package com.mkiperszmid.onboarding_presentation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/mkiperszmid/onboarding_presentation/OnboardingViewModel;", "Landroidx/lifecycle/ViewModel;", "hasSeenOnboardingUseCase", "Lcom/mkiperszmid/onboarding_domain/usecase/HasSeenOnboardingUseCase;", "completeOnboardingUseCase", "Lcom/mkiperszmid/onboarding_domain/usecase/CompleteOnboardingUseCase;", "(Lcom/mkiperszmid/onboarding_domain/usecase/HasSeenOnboardingUseCase;Lcom/mkiperszmid/onboarding_domain/usecase/CompleteOnboardingUseCase;)V", "<set-?>", "", "hasSeenOnboarding", "getHasSeenOnboarding", "()Z", "setHasSeenOnboarding", "(Z)V", "hasSeenOnboarding$delegate", "Landroidx/compose/runtime/MutableState;", "completeOnboarding", "", "onboarding_presentation_debug"})
public final class OnboardingViewModel extends androidx.lifecycle.ViewModel {
    private final com.mkiperszmid.onboarding_domain.usecase.HasSeenOnboardingUseCase hasSeenOnboardingUseCase = null;
    private final com.mkiperszmid.onboarding_domain.usecase.CompleteOnboardingUseCase completeOnboardingUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState hasSeenOnboarding$delegate = null;
    
    @javax.inject.Inject
    public OnboardingViewModel(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.onboarding_domain.usecase.HasSeenOnboardingUseCase hasSeenOnboardingUseCase, @org.jetbrains.annotations.NotNull
    com.mkiperszmid.onboarding_domain.usecase.CompleteOnboardingUseCase completeOnboardingUseCase) {
        super();
    }
    
    public final boolean getHasSeenOnboarding() {
        return false;
    }
    
    private final void setHasSeenOnboarding(boolean p0) {
    }
    
    public final void completeOnboarding() {
    }
}