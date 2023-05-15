package com.mkiperszmid.habitsappcourse.home.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.mkiperszmid.habitsappcourse.home.data.local.entity.HabitEntity
import com.mkiperszmid.habitsappcourse.home.data.local.entity.HabitSyncEntity
import com.mkiperszmid.habitsappcourse.home.data.local.typeconverter.HomeTypeConverter

@Database(entities = [HabitEntity::class, HabitSyncEntity::class], version = 1)
@TypeConverters(
    HomeTypeConverter::class
)
abstract class HomeDatabase : RoomDatabase() {
    abstract val dao: HomeDao
}
