package com.mkiperszmid.habitsappcourse.home.data.remote.dto

data class HabitDto(
    val name: String,
    val reminder: Long,
    val startDate: Long,
    val frequency: List<Int>,
    val completedDates: List<Long>?
)
