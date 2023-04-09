package com.mkiperszmid.habitsappcourse.authentication.di

import com.mkiperszmid.habitsappcourse.authentication.data.matcher.EmailMatcherImpl
import com.mkiperszmid.habitsappcourse.authentication.data.repository.AuthenticationRepositoryImpl
import com.mkiperszmid.habitsappcourse.authentication.domain.matcher.EmailMatcher
import com.mkiperszmid.habitsappcourse.authentication.domain.repository.AuthenticationRepository
import com.mkiperszmid.habitsappcourse.authentication.domain.usecase.LoginUseCases
import com.mkiperszmid.habitsappcourse.authentication.domain.usecase.LoginWithEmailUseCase
import com.mkiperszmid.habitsappcourse.authentication.domain.usecase.ValidateEmailUseCase
import com.mkiperszmid.habitsappcourse.authentication.domain.usecase.ValidatePasswordUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AuthenticationModule {
    @Provides
    @Singleton
    fun provideAuthenticationRepository(): AuthenticationRepository {
        return AuthenticationRepositoryImpl()
    }

    @Provides
    @Singleton
    fun provideEmailMatcher(): EmailMatcher {
        return EmailMatcherImpl()
    }

    @Provides
    @Singleton
    fun provideLoginUseCases(
        repository: AuthenticationRepository,
        emailMatcher: EmailMatcher
    ): LoginUseCases {
        return LoginUseCases(
            loginWithEmailUseCase = LoginWithEmailUseCase(repository),
            validateEmailUseCase = ValidateEmailUseCase(emailMatcher),
            validatePasswordUseCase = ValidatePasswordUseCase()
        )
    }
}
