package com.mkiperszmid.home_data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class HabitSyncEntity(
    @PrimaryKey(autoGenerate = false)
    val id: String
)
