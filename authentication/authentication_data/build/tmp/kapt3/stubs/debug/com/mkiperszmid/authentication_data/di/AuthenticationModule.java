package com.mkiperszmid.authentication_data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/mkiperszmid/authentication_data/di/AuthenticationModule;", "", "()V", "provideAuthenticationRepository", "Lcom/mkiperszmid/authentication_domain/repository/AuthenticationRepository;", "provideEmailMatcher", "Lcom/mkiperszmid/authentication_domain/matcher/EmailMatcher;", "provideGetUserIdUseCase", "Lcom/mkiperszmid/authentication_domain/usecase/GetUserIdUseCase;", "repository", "provideLoginUseCases", "Lcom/mkiperszmid/authentication_domain/usecase/LoginUseCases;", "emailMatcher", "provideLogoutUseCase", "Lcom/mkiperszmid/authentication_domain/usecase/LogoutUseCase;", "provideSignupUseCases", "Lcom/mkiperszmid/authentication_domain/usecase/SignupUseCases;", "authentication_data_debug"})
@dagger.Module
public final class AuthenticationModule {
    @org.jetbrains.annotations.NotNull
    public static final com.mkiperszmid.authentication_data.di.AuthenticationModule INSTANCE = null;
    
    private AuthenticationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.mkiperszmid.authentication_domain.repository.AuthenticationRepository provideAuthenticationRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.mkiperszmid.authentication_domain.matcher.EmailMatcher provideEmailMatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.mkiperszmid.authentication_domain.usecase.SignupUseCases provideSignupUseCases(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.authentication_domain.repository.AuthenticationRepository repository, @org.jetbrains.annotations.NotNull
    com.mkiperszmid.authentication_domain.matcher.EmailMatcher emailMatcher) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.mkiperszmid.authentication_domain.usecase.LoginUseCases provideLoginUseCases(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.authentication_domain.repository.AuthenticationRepository repository, @org.jetbrains.annotations.NotNull
    com.mkiperszmid.authentication_domain.matcher.EmailMatcher emailMatcher) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.mkiperszmid.authentication_domain.usecase.GetUserIdUseCase provideGetUserIdUseCase(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.authentication_domain.repository.AuthenticationRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.mkiperszmid.authentication_domain.usecase.LogoutUseCase provideLogoutUseCase(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.authentication_domain.repository.AuthenticationRepository repository) {
        return null;
    }
}