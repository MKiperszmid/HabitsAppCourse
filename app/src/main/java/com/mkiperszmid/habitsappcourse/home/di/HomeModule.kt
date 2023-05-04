package com.mkiperszmid.habitsappcourse.home.di

import android.content.Context
import androidx.room.Room
import com.mkiperszmid.habitsappcourse.home.data.local.HomeDao
import com.mkiperszmid.habitsappcourse.home.data.local.HomeDatabase
import com.mkiperszmid.habitsappcourse.home.data.local.typeconverter.HomeTypeConverter
import com.mkiperszmid.habitsappcourse.home.data.repository.HomeRepositoryImpl
import com.mkiperszmid.habitsappcourse.home.domain.detail.usecase.DetailUseCases
import com.mkiperszmid.habitsappcourse.home.domain.detail.usecase.GetHabitByIdUseCase
import com.mkiperszmid.habitsappcourse.home.domain.detail.usecase.InsertHabitUseCase
import com.mkiperszmid.habitsappcourse.home.domain.home.usecase.CompleteHabitUseCase
import com.mkiperszmid.habitsappcourse.home.domain.home.usecase.GetHabitsForDateUseCase
import com.mkiperszmid.habitsappcourse.home.domain.home.usecase.HomeUseCases
import com.mkiperszmid.habitsappcourse.home.domain.repository.HomeRepository
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HomeModule {
    @Singleton
    @Provides
    fun provideHomeUseCases(repository: HomeRepository): HomeUseCases {
        return HomeUseCases(
            completeHabitUseCase = CompleteHabitUseCase(repository),
            getHabitsForDateUseCase = GetHabitsForDateUseCase(repository)
        )
    }

    @Singleton
    @Provides
    fun provideDetailUseCases(repository: HomeRepository): DetailUseCases {
        return DetailUseCases(
            getHabitByIdUseCase = GetHabitByIdUseCase(repository),
            insertHabitUseCase = InsertHabitUseCase(repository)
        )
    }

    @Singleton
    @Provides
    fun provideHabitDao(@ApplicationContext context: Context, moshi: Moshi): HomeDao {
        return Room.databaseBuilder(
            context,
            HomeDatabase::class.java,
            "habits_db"
        ).addTypeConverter(HomeTypeConverter(moshi)).build().dao
    }

    @Singleton
    @Provides
    fun provideHomeRepository(dao: HomeDao): HomeRepository {
        return HomeRepositoryImpl(dao)
    }

    @Singleton
    @Provides
    fun provideMoshi(): Moshi {
        return Moshi.Builder().build()
    }
}
