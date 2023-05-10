package com.mkiperszmid.habitsappcourse.home.domain.alarm

import com.mkiperszmid.habitsappcourse.home.domain.models.Habit

interface AlarmHandler {
    fun setRecurringAlarm(habit: Habit)
    fun cancel(habit: Habit)
}