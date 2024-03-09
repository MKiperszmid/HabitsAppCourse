package com.mkiperszmid.home_data.alarm

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import com.mkiperszmid.home_data.extension.toTimeStamp
import com.mkiperszmid.home_domain.alarm.AlarmHandler
import com.mkiperszmid.home_domain.models.Habit
import java.time.DayOfWeek
import java.time.ZonedDateTime

class AlarmHandlerImpl(
    private val context: Context
) : com.mkiperszmid.home_domain.alarm.AlarmHandler {
    private val alarmManager = context.getSystemService(AlarmManager::class.java)

    override fun setRecurringAlarm(habit: com.mkiperszmid.home_domain.models.Habit) {
        val nextOcurrance = calculateNextOcurrance(habit)
        alarmManager.setExactAndAllowWhileIdle(
            AlarmManager.RTC_WAKEUP,
            nextOcurrance.toTimeStamp(),
            createPrendingIntent(habit, nextOcurrance.dayOfWeek)
        )
    }

    private fun createPrendingIntent(habit: com.mkiperszmid.home_domain.models.Habit, dayOfWeek: DayOfWeek): PendingIntent {
        val intent = Intent(context, AlarmReceiver::class.java).apply {
            putExtra(AlarmReceiver.HABIT_ID, habit.id)
        }
        return PendingIntent.getBroadcast(
            context,
            habit.id.hashCode() * 10 + dayOfWeek.value,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
    }

    private fun calculateNextOcurrance(habit: com.mkiperszmid.home_domain.models.Habit): ZonedDateTime {
        val today = ZonedDateTime.now()
        var nextOcurrance = ZonedDateTime.of(today.toLocalDate(), habit.reminder, today.zone)
        if (habit.frequency.contains(today.dayOfWeek) && today.isBefore(nextOcurrance)) {
            return nextOcurrance
        }

        do {
            nextOcurrance = nextOcurrance.plusDays(1)
        } while (!habit.frequency.contains(nextOcurrance.dayOfWeek))

        return nextOcurrance
    }

    override fun cancel(habit: com.mkiperszmid.home_domain.models.Habit) {
        val nextOcurrance = calculateNextOcurrance(habit)
        val pending = createPrendingIntent(habit, nextOcurrance.dayOfWeek)
        alarmManager.cancel(pending)
    }
}
