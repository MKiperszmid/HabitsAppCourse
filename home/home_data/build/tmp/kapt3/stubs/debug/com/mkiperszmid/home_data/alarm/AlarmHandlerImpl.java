package com.mkiperszmid.home_data.alarm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/mkiperszmid/home_data/alarm/AlarmHandlerImpl;", "Lcom/mkiperszmid/home_domain/alarm/AlarmHandler;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "alarmManager", "Landroid/app/AlarmManager;", "kotlin.jvm.PlatformType", "calculateNextOcurrance", "Ljava/time/ZonedDateTime;", "habit", "Lcom/mkiperszmid/home_domain/models/Habit;", "cancel", "", "createPrendingIntent", "Landroid/app/PendingIntent;", "dayOfWeek", "Ljava/time/DayOfWeek;", "setRecurringAlarm", "home_data_debug"})
public final class AlarmHandlerImpl implements com.mkiperszmid.home_domain.alarm.AlarmHandler {
    private final android.content.Context context = null;
    private final android.app.AlarmManager alarmManager = null;
    
    public AlarmHandlerImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override
    public void setRecurringAlarm(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_domain.models.Habit habit) {
    }
    
    private final android.app.PendingIntent createPrendingIntent(com.mkiperszmid.home_domain.models.Habit habit, java.time.DayOfWeek dayOfWeek) {
        return null;
    }
    
    private final java.time.ZonedDateTime calculateNextOcurrance(com.mkiperszmid.home_domain.models.Habit habit) {
        return null;
    }
    
    @java.lang.Override
    public void cancel(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_domain.models.Habit habit) {
    }
}