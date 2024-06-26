package com.mkiperszmid.onboarding_data.di

import android.content.Context
import android.content.SharedPreferences
import com.mkiperszmid.onboarding_data.repository.OnboardingRepositoryImpl
import com.mkiperszmid.onboarding_domain.repository.OnboardingRepository
import com.mkiperszmid.onboarding_domain.usecase.CompleteOnboardingUseCase
import com.mkiperszmid.onboarding_domain.usecase.HasSeenOnboardingUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object OnboardingModule {
    @Provides
    @Singleton
    fun provideSharedPreference(@ApplicationContext context: Context): SharedPreferences {
        return context.getSharedPreferences("habits_onboarding_preference", Context.MODE_PRIVATE)
    }

    @Provides
    @Singleton
    fun provideOnboardingRepository(sharedPreferences: SharedPreferences): com.mkiperszmid.onboarding_domain.repository.OnboardingRepository {
        return OnboardingRepositoryImpl(sharedPreferences)
    }

    @Provides
    @Singleton
    fun provideHasSeenOnboardingUseCase(repository: com.mkiperszmid.onboarding_domain.repository.OnboardingRepository): com.mkiperszmid.onboarding_domain.usecase.HasSeenOnboardingUseCase {
        return com.mkiperszmid.onboarding_domain.usecase.HasSeenOnboardingUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideCompleteOnboardingUseCase(repository: com.mkiperszmid.onboarding_domain.repository.OnboardingRepository): com.mkiperszmid.onboarding_domain.usecase.CompleteOnboardingUseCase {
        return com.mkiperszmid.onboarding_domain.usecase.CompleteOnboardingUseCase(repository)
    }
}
