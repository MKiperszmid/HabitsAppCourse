// Generated by Dagger (https://dagger.dev).
package com.mkiperszmid.authentication_data.di;

import com.mkiperszmid.authentication_domain.repository.AuthenticationRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AuthenticationModule_ProvideAuthenticationRepositoryFactory implements Factory<AuthenticationRepository> {
  @Override
  public AuthenticationRepository get() {
    return provideAuthenticationRepository();
  }

  public static AuthenticationModule_ProvideAuthenticationRepositoryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AuthenticationRepository provideAuthenticationRepository() {
    return Preconditions.checkNotNullFromProvides(AuthenticationModule.INSTANCE.provideAuthenticationRepository());
  }

  private static final class InstanceHolder {
    private static final AuthenticationModule_ProvideAuthenticationRepositoryFactory INSTANCE = new AuthenticationModule_ProvideAuthenticationRepositoryFactory();
  }
}