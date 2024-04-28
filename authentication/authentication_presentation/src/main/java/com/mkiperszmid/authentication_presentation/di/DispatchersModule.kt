package com.mkiperszmid.authentication_presentation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import javax.inject.Qualifier
import javax.inject.Singleton

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class MainDispatcher

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class IoDispatcher

@Module
@InstallIn(SingletonComponent::class)
object DispatchersModule {
    @MainDispatcher
    @Provides
    @Singleton
    fun provideMainDispatcher() = Dispatchers.Main

    @IoDispatcher
    @Provides
    @Singleton
    fun provideIODispatcher() = Dispatchers.IO
}