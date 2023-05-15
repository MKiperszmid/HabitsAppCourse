package com.mkiperszmid.habitsappcourse.home.data.mapper

import com.mkiperszmid.habitsappcourse.home.data.extension.toStartOfDateTimestamp
import com.mkiperszmid.habitsappcourse.home.data.extension.toTimeStamp
import com.mkiperszmid.habitsappcourse.home.data.extension.toZonedDateTime
import com.mkiperszmid.habitsappcourse.home.data.local.entity.HabitEntity
import com.mkiperszmid.habitsappcourse.home.data.local.entity.HabitSyncEntity
import com.mkiperszmid.habitsappcourse.home.data.remote.dto.HabitDto
import com.mkiperszmid.habitsappcourse.home.data.remote.dto.HabitResponse
import com.mkiperszmid.habitsappcourse.home.domain.models.Habit
import java.time.DayOfWeek

fun HabitEntity.toDomain(): Habit {
    return Habit(
        id = this.id,
        name = this.name,
        frequency = this.frequency.map { DayOfWeek.of(it) },
        completedDates = this.completedDates.map { it.toZonedDateTime().toLocalDate() },
        reminder = this.reminder.toZonedDateTime().toLocalTime(),
        startDate = this.startDate.toZonedDateTime()
    )
}

fun Habit.toEntity(): HabitEntity {
    return HabitEntity(
        id = this.id,
        name = this.name,
        frequency = this.frequency.map { it.value },
        completedDates = this.completedDates.map { it.toZonedDateTime().toTimeStamp() },
        reminder = this.reminder.toZonedDateTime().toTimeStamp(),
        startDate = this.startDate.toStartOfDateTimestamp()
    )
}

fun HabitResponse.toDomain(): List<Habit> {
    return this.entries.map {
        val id = it.key
        val dto = it.value
        Habit(
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

fun Habit.toDto(): HabitResponse {
    val dto = HabitDto(
        name = this.name,
        frequency = this.frequency.map { it.value },
        completedDates = this.completedDates.map { it.toZonedDateTime().toTimeStamp() },
        reminder = this.reminder.toZonedDateTime().toTimeStamp(),
        startDate = this.startDate.toStartOfDateTimestamp()
    )
    return mapOf(id to dto)
}

fun Habit.toSyncEntity(): HabitSyncEntity {
    return HabitSyncEntity(id)
}
