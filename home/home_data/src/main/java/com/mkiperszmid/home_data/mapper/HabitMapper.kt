package com.mkiperszmid.home_data.mapper

import com.mkiperszmid.home_data.extension.toStartOfDateTimestamp
import com.mkiperszmid.home_data.extension.toTimeStamp
import com.mkiperszmid.home_data.extension.toZonedDateTime
import com.mkiperszmid.home_data.local.entity.HabitEntity
import com.mkiperszmid.home_data.local.entity.HabitSyncEntity
import com.mkiperszmid.home_data.remote.dto.HabitDto
import com.mkiperszmid.home_data.remote.dto.HabitResponse
import com.mkiperszmid.home_domain.models.Habit
import java.time.DayOfWeek

fun HabitEntity.toDomain(): com.mkiperszmid.home_domain.models.Habit {
    return com.mkiperszmid.home_domain.models.Habit(
        id = this.id,
        name = this.name,
        frequency = this.frequency.map { DayOfWeek.of(it) },
        completedDates = this.completedDates.map { it.toZonedDateTime().toLocalDate() },
        reminder = this.reminder.toZonedDateTime().toLocalTime(),
        startDate = this.startDate.toZonedDateTime()
    )
}

fun com.mkiperszmid.home_domain.models.Habit.toEntity(): HabitEntity {
    return HabitEntity(
        id = this.id,
        name = this.name,
        frequency = this.frequency.map { it.value },
        completedDates = this.completedDates.map { it.toZonedDateTime().toTimeStamp() },
        reminder = this.reminder.toZonedDateTime().toTimeStamp(),
        startDate = this.startDate.toStartOfDateTimestamp()
    )
}

fun HabitResponse.toDomain(): List<com.mkiperszmid.home_domain.models.Habit> {
    return this.entries.map {
        val id = it.key
        val dto = it.value
        com.mkiperszmid.home_domain.models.Habit(
            id = id,
            name = dto.name,
            frequency = dto.frequency.map { DayOfWeek.of(it) },
            completedDates = dto.completedDates?.map { it.toZonedDateTime().toLocalDate() }
                ?: emptyList(),
            reminder = dto.reminder.toZonedDateTime().toLocalTime(),
            startDate = dto.startDate.toZonedDateTime()
        )
    }
}

fun com.mkiperszmid.home_domain.models.Habit.toDto(): HabitResponse {
    val dto = HabitDto(
        name = this.name,
        frequency = this.frequency.map { it.value },
        completedDates = this.completedDates.map { it.toZonedDateTime().toTimeStamp() },
        reminder = this.reminder.toZonedDateTime().toTimeStamp(),
        startDate = this.startDate.toStartOfDateTimestamp()
    )
    return mapOf(id to dto)
}

fun com.mkiperszmid.home_domain.models.Habit.toSyncEntity(): HabitSyncEntity {
    return HabitSyncEntity(id)
}
