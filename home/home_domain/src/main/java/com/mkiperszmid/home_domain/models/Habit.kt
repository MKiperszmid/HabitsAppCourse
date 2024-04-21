package com.mkiperszmid.home_domain.models

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalTime
import java.time.ZonedDateTime

data class Habit(
    val id: String,
    val name: String,
    val frequency: List<DayOfWeek>,
    val completedDates: List<LocalDate>,
    val reminder: LocalTime,
    val startDate: ZonedDateTime
)
