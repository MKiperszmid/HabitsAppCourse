package com.mkiperszmid.home_domain.alarm

import com.mkiperszmid.home_domain.models.Habit

interface AlarmHandler {
    fun setRecurringAlarm(habit: Habit)
    fun cancel(habit: Habit)
}