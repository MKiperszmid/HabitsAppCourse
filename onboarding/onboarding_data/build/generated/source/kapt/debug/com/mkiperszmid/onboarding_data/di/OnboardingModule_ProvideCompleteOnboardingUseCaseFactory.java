// Generated by Dagger (https://dagger.dev).
package com.mkiperszmid.onboarding_data.di;

import com.mkiperszmid.onboarding_domain.repository.OnboardingRepository;
import com.mkiperszmid.onboarding_domain.usecase.CompleteOnboardingUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class OnboardingModule_ProvideCompleteOnboardingUseCaseFactory implements Factory<CompleteOnboardingUseCase> {
  private final Provider<OnboardingRepository> repositoryProvider;

  public OnboardingModule_ProvideCompleteOnboardingUseCaseFactory(
      Provider<OnboardingRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public CompleteOnboardingUseCase get() {
    return provideCompleteOnboardingUseCase(repositoryProvider.get());
  }

  public static OnboardingModule_ProvideCompleteOnboardingUseCaseFactory create(
      Provider<OnboardingRepository> repositoryProvider) {
    return new OnboardingModule_ProvideCompleteOnboardingUseCaseFactory(repositoryProvider);
  }

  public static CompleteOnboardingUseCase provideCompleteOnboardingUseCase(
      OnboardingRepository repository) {
    return Preconditions.checkNotNullFromProvides(OnboardingModule.INSTANCE.provideCompleteOnboardingUseCase(repository));
  }
}
