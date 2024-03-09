package com.mkiperszmid.onboarding_data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/mkiperszmid/onboarding_data/repository/OnboardingRepositoryImpl;", "Lcom/mkiperszmid/onboarding_domain/repository/OnboardingRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "completeOnboarding", "", "hasSeenOnboarding", "", "Companion", "onboarding_data_debug"})
public final class OnboardingRepositoryImpl implements com.mkiperszmid.onboarding_domain.repository.OnboardingRepository {
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull
    public static final com.mkiperszmid.onboarding_data.repository.OnboardingRepositoryImpl.Companion Companion = null;
    private static final java.lang.String HAS_SEEN_ONBOARDING = "has_seen_onboarding";
    
    public OnboardingRepositoryImpl(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    @java.lang.Override
    public boolean hasSeenOnboarding() {
        return false;
    }
    
    @java.lang.Override
    public void completeOnboarding() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/mkiperszmid/onboarding_data/repository/OnboardingRepositoryImpl$Companion;", "", "()V", "HAS_SEEN_ONBOARDING", "", "onboarding_data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}