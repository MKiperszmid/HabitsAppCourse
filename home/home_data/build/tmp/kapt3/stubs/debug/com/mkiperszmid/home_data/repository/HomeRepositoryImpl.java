package com.mkiperszmid.home_data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0019\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0002J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0011\u0010\u001e\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/mkiperszmid/home_data/repository/HomeRepositoryImpl;", "Lcom/mkiperszmid/home_domain/repository/HomeRepository;", "dao", "Lcom/mkiperszmid/home_data/local/HomeDao;", "api", "Lcom/mkiperszmid/home_data/remote/HomeApi;", "alarmHandler", "Lcom/mkiperszmid/home_domain/alarm/AlarmHandler;", "workManager", "Landroidx/work/WorkManager;", "(Lcom/mkiperszmid/home_data/local/HomeDao;Lcom/mkiperszmid/home_data/remote/HomeApi;Lcom/mkiperszmid/home_domain/alarm/AlarmHandler;Landroidx/work/WorkManager;)V", "getAllHabitsForSelectedDate", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/mkiperszmid/home_domain/models/Habit;", "date", "Ljava/time/ZonedDateTime;", "getHabitById", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHabitsFromApi", "handleAlarm", "", "habit", "(Lcom/mkiperszmid/home_domain/models/Habit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertHabit", "insertHabits", "habits", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncHabits", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "home_data_debug"})
public final class HomeRepositoryImpl implements com.mkiperszmid.home_domain.repository.HomeRepository {
    private final com.mkiperszmid.home_data.local.HomeDao dao = null;
    private final com.mkiperszmid.home_data.remote.HomeApi api = null;
    private final com.mkiperszmid.home_domain.alarm.AlarmHandler alarmHandler = null;
    private final androidx.work.WorkManager workManager = null;
    
    public HomeRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_data.local.HomeDao dao, @org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_data.remote.HomeApi api, @org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_domain.alarm.AlarmHandler alarmHandler, @org.jetbrains.annotations.NotNull
    androidx.work.WorkManager workManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.mkiperszmid.home_domain.models.Habit>> getAllHabitsForSelectedDate(@org.jetbrains.annotations.NotNull
    java.time.ZonedDateTime date) {
        return null;
    }
    
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.mkiperszmid.home_domain.models.Habit>> getHabitsFromApi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertHabit(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_domain.models.Habit habit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object insertHabits(java.util.List<com.mkiperszmid.home_domain.models.Habit> habits, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleAlarm(com.mkiperszmid.home_domain.models.Habit habit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getHabitById(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.mkiperszmid.home_domain.models.Habit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object syncHabits(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}