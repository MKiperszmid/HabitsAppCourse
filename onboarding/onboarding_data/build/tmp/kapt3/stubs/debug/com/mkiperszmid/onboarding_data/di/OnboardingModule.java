package com.mkiperszmid.onboarding_data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/mkiperszmid/onboarding_data/di/OnboardingModule;", "", "()V", "provideCompleteOnboardingUseCase", "Lcom/mkiperszmid/onboarding_domain/usecase/CompleteOnboardingUseCase;", "repository", "Lcom/mkiperszmid/onboarding_domain/repository/OnboardingRepository;", "provideHasSeenOnboardingUseCase", "Lcom/mkiperszmid/onboarding_domain/usecase/HasSeenOnboardingUseCase;", "provideOnboardingRepository", "sharedPreferences", "Landroid/content/SharedPreferences;", "provideSharedPreference", "context", "Landroid/content/Context;", "onboarding_data_debug"})
@dagger.Module
public final class OnboardingModule {
    @org.jetbrains.annotations.NotNull
    public static final com.mkiperszmid.onboarding_data.di.OnboardingModule INSTANCE = null;
    
    private OnboardingModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final android.content.SharedPreferences provideSharedPreference(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.mkiperszmid.onboarding_domain.repository.OnboardingRepository provideOnboardingRepository(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.mkiperszmid.onboarding_domain.usecase.HasSeenOnboardingUseCase provideHasSeenOnboardingUseCase(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.onboarding_domain.repository.OnboardingRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.mkiperszmid.onboarding_domain.usecase.CompleteOnboardingUseCase provideCompleteOnboardingUseCase(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.onboarding_domain.repository.OnboardingRepository repository) {
        return null;
    }
}