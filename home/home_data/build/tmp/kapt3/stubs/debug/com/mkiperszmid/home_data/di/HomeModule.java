package com.mkiperszmid.home_data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J(\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u0019\u001a\u00020\u0010H\u0007J\u0012\u0010\u001a\u001a\u00020\u00162\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/mkiperszmid/home_data/di/HomeModule;", "", "()V", "provideAlarmHandler", "Lcom/mkiperszmid/home_domain/alarm/AlarmHandler;", "context", "Landroid/content/Context;", "provideDetailUseCases", "Lcom/mkiperszmid/home_domain/detail/usecase/DetailUseCases;", "repository", "Lcom/mkiperszmid/home_domain/repository/HomeRepository;", "provideHabitDao", "Lcom/mkiperszmid/home_data/local/HomeDao;", "provideHomeApi", "Lcom/mkiperszmid/home_data/remote/HomeApi;", "client", "Lokhttp3/OkHttpClient;", "provideHomeRepository", "dao", "api", "alarmHandler", "workManager", "Landroidx/work/WorkManager;", "provideHomeUseCases", "Lcom/mkiperszmid/home_domain/home/usecase/HomeUseCases;", "provideOkHttpClient", "provideWorkManager", "home_data_debug"})
@dagger.Module
public final class HomeModule {
    @org.jetbrains.annotations.NotNull
    public static final com.mkiperszmid.home_data.di.HomeModule INSTANCE = null;
    
    private HomeModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.mkiperszmid.home_domain.home.usecase.HomeUseCases provideHomeUseCases(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_domain.repository.HomeRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.mkiperszmid.home_domain.detail.usecase.DetailUseCases provideDetailUseCases(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_domain.repository.HomeRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.mkiperszmid.home_data.local.HomeDao provideHabitDao(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.mkiperszmid.home_data.remote.HomeApi provideHomeApi(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.mkiperszmid.home_domain.repository.HomeRepository provideHomeRepository(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_data.local.HomeDao dao, @org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_data.remote.HomeApi api, @org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_domain.alarm.AlarmHandler alarmHandler, @org.jetbrains.annotations.NotNull
    androidx.work.WorkManager workManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final androidx.work.WorkManager provideWorkManager(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.mkiperszmid.home_domain.alarm.AlarmHandler provideAlarmHandler(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
}