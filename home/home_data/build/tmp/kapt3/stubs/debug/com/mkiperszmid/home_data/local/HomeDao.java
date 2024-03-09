package com.mkiperszmid.home_data.local;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\'J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0019\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/mkiperszmid/home_data/local/HomeDao;", "", "deleteHabitSync", "", "habitSyncEntity", "Lcom/mkiperszmid/home_data/local/entity/HabitSyncEntity;", "(Lcom/mkiperszmid/home_data/local/entity/HabitSyncEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllHabits", "", "Lcom/mkiperszmid/home_data/local/entity/HabitEntity;", "getAllHabitsForSelectedDate", "Lkotlinx/coroutines/flow/Flow;", "date", "", "getAllHabitsSync", "getHabitById", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertHabit", "habitEntity", "(Lcom/mkiperszmid/home_data/local/entity/HabitEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertHabitSync", "home_data_debug"})
public abstract interface HomeDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertHabit(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_data.local.entity.HabitEntity habitEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM HabitEntity WHERE id = :id")
    public abstract java.lang.Object getHabitById(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.mkiperszmid.home_data.local.entity.HabitEntity> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM HabitEntity WHERE startDate <= :date ORDER BY id ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.mkiperszmid.home_data.local.entity.HabitEntity>> getAllHabitsForSelectedDate(long date);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM HabitEntity")
    public abstract java.util.List<com.mkiperszmid.home_data.local.entity.HabitEntity> getAllHabits();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertHabitSync(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_data.local.entity.HabitSyncEntity habitSyncEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM HabitSyncEntity")
    public abstract java.util.List<com.mkiperszmid.home_data.local.entity.HabitSyncEntity> getAllHabitsSync();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteHabitSync(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_data.local.entity.HabitSyncEntity habitSyncEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}