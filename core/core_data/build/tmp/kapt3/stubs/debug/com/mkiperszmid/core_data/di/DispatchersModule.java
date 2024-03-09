package com.mkiperszmid.core_data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/mkiperszmid/core_data/di/DispatchersModule;", "", "()V", "provideIODispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideMainDispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "core_data_debug"})
@dagger.Module
public final class DispatchersModule {
    @org.jetbrains.annotations.NotNull
    public static final com.mkiperszmid.core_data.di.DispatchersModule INSTANCE = null;
    
    private DispatchersModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @MainDispatcher
    @javax.inject.Singleton
    @dagger.Provides
    public final kotlinx.coroutines.MainCoroutineDispatcher provideMainDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @IoDispatcher
    @javax.inject.Singleton
    @dagger.Provides
    public final kotlinx.coroutines.CoroutineDispatcher provideIODispatcher() {
        return null;
    }
}