package com.mkiperszmid.home_data.local;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.mkiperszmid.home_data.local.typeconverter.HomeTypeConverter.class})
@androidx.room.Database(entities = {com.mkiperszmid.home_data.local.entity.HabitEntity.class, com.mkiperszmid.home_data.local.entity.HabitSyncEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/mkiperszmid/home_data/local/HomeDatabase;", "Landroidx/room/RoomDatabase;", "()V", "dao", "Lcom/mkiperszmid/home_data/local/HomeDao;", "getDao", "()Lcom/mkiperszmid/home_data/local/HomeDao;", "home_data_debug"})
public abstract class HomeDatabase extends androidx.room.RoomDatabase {
    
    public HomeDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.mkiperszmid.home_data.local.HomeDao getDao();
}