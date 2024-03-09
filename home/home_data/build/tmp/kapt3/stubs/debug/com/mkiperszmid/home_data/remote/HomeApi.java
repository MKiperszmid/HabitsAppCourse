package com.mkiperszmid.home_data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J+\u0010\b\u001a\u00020\t2\u0018\b\u0001\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/mkiperszmid/home_data/remote/HomeApi;", "", "getAllHabits", "", "", "Lcom/mkiperszmid/home_data/remote/dto/HabitDto;", "Lcom/mkiperszmid/home_data/remote/dto/HabitResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertHabit", "", "habit", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "home_data_debug"})
public abstract interface HomeApi {
    @org.jetbrains.annotations.NotNull
    public static final com.mkiperszmid.home_data.remote.HomeApi.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "https://dailyhabits-9c212-default-rtdb.firebaseio.com/";
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "habits.json")
    public abstract java.lang.Object getAllHabits(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, com.mkiperszmid.home_data.remote.dto.HabitDto>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.PATCH(value = "habits.json")
    public abstract java.lang.Object insertHabit(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    java.util.Map<java.lang.String, com.mkiperszmid.home_data.remote.dto.HabitDto> habit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/mkiperszmid/home_data/remote/HomeApi$Companion;", "", "()V", "BASE_URL", "", "home_data_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String BASE_URL = "https://dailyhabits-9c212-default-rtdb.firebaseio.com/";
        
        private Companion() {
            super();
        }
    }
}