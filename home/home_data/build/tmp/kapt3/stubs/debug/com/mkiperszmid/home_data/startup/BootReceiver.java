package com.mkiperszmid.home_data.startup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/mkiperszmid/home_data/startup/BootReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "alarmHandler", "Lcom/mkiperszmid/home_domain/alarm/AlarmHandler;", "getAlarmHandler", "()Lcom/mkiperszmid/home_domain/alarm/AlarmHandler;", "setAlarmHandler", "(Lcom/mkiperszmid/home_domain/alarm/AlarmHandler;)V", "homeDao", "Lcom/mkiperszmid/home_data/local/HomeDao;", "getHomeDao", "()Lcom/mkiperszmid/home_data/local/HomeDao;", "setHomeDao", "(Lcom/mkiperszmid/home_data/local/HomeDao;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "home_data_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class BootReceiver extends android.content.BroadcastReceiver {
    @javax.inject.Inject
    public com.mkiperszmid.home_domain.alarm.AlarmHandler alarmHandler;
    @javax.inject.Inject
    public com.mkiperszmid.home_data.local.HomeDao homeDao;
    
    public BootReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.mkiperszmid.home_domain.alarm.AlarmHandler getAlarmHandler() {
        return null;
    }
    
    public final void setAlarmHandler(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_domain.alarm.AlarmHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.mkiperszmid.home_data.local.HomeDao getHomeDao() {
        return null;
    }
    
    public final void setHomeDao(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_data.local.HomeDao p0) {
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
}