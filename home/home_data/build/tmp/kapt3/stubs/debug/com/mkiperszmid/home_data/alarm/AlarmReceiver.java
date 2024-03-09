package com.mkiperszmid.home_data.alarm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001c\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/mkiperszmid/home_data/alarm/AlarmReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "alarmHandler", "Lcom/mkiperszmid/home_domain/alarm/AlarmHandler;", "getAlarmHandler", "()Lcom/mkiperszmid/home_domain/alarm/AlarmHandler;", "setAlarmHandler", "(Lcom/mkiperszmid/home_domain/alarm/AlarmHandler;)V", "repository", "Lcom/mkiperszmid/home_domain/repository/HomeRepository;", "getRepository", "()Lcom/mkiperszmid/home_domain/repository/HomeRepository;", "setRepository", "(Lcom/mkiperszmid/home_domain/repository/HomeRepository;)V", "createNotificationChannel", "", "context", "Landroid/content/Context;", "onReceive", "intent", "Landroid/content/Intent;", "showNotification", "habit", "Lcom/mkiperszmid/home_domain/models/Habit;", "Companion", "home_data_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class AlarmReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull
    public static final com.mkiperszmid.home_data.alarm.AlarmReceiver.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String HABIT_ID = "habit_id";
    private static final java.lang.String CHANNEL_ID = "habits_channel";
    @javax.inject.Inject
    public com.mkiperszmid.home_domain.repository.HomeRepository repository;
    @javax.inject.Inject
    public com.mkiperszmid.home_domain.alarm.AlarmHandler alarmHandler;
    
    public AlarmReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.mkiperszmid.home_domain.repository.HomeRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_domain.repository.HomeRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.mkiperszmid.home_domain.alarm.AlarmHandler getAlarmHandler() {
        return null;
    }
    
    public final void setAlarmHandler(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_domain.alarm.AlarmHandler p0) {
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
    
    private final void showNotification(android.content.Context context, com.mkiperszmid.home_domain.models.Habit habit) {
    }
    
    private final void createNotificationChannel(android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/mkiperszmid/home_data/alarm/AlarmReceiver$Companion;", "", "()V", "CHANNEL_ID", "", "HABIT_ID", "home_data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}