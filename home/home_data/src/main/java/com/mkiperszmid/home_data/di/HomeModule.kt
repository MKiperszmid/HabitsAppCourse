package com.mkiperszmid.home_data.di

import android.content.Context
import androidx.room.Room
import androidx.work.WorkManager
import com.mkiperszmid.home_data.alarm.AlarmHandlerImpl
import com.mkiperszmid.home_data.local.HomeDao
import com.mkiperszmid.home_data.local.HomeDatabase
import com.mkiperszmid.home_data.local.typeconverter.HomeTypeConverter
import com.mkiperszmid.home_data.remote.HomeApi
import com.mkiperszmid.home_data.repository.HomeRepositoryImpl
import com.mkiperszmid.home_domain.alarm.AlarmHandler
import com.mkiperszmid.home_domain.detail.usecase.DetailUseCases
import com.mkiperszmid.home_domain.detail.usecase.GetHabitByIdUseCase
import com.mkiperszmid.home_domain.detail.usecase.InsertHabitUseCase
import com.mkiperszmid.home_domain.home.usecase.CompleteHabitUseCase
import com.mkiperszmid.home_domain.home.usecase.GetHabitsForDateUseCase
import com.mkiperszmid.home_domain.home.usecase.HomeUseCases
import com.mkiperszmid.home_domain.home.usecase.SyncHabitUseCase
import com.mkiperszmid.home_domain.repository.HomeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HomeModule {
    @Singleton
    @Provides
    fun provideHomeUseCases(repository: HomeRepository): HomeUseCases {
        return HomeUseCases(
            completeHabitUseCase = CompleteHabitUseCase(repository),
            getHabitsForDateUseCase = GetHabitsForDateUseCase(repository),
            syncHabitUseCase = SyncHabitUseCase(repository)
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
    fun provideHabitDao(@ApplicationContext context: Context): HomeDao {
        return Room.databaseBuilder(
            context,
            HomeDatabase::class.java,
            "habits_db"
        ).addTypeConverter(HomeTypeConverter()).build().dao
    }

    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder().addInterceptor(
            HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            }
        ).build()
    }

    @Singleton
    @Provides
    fun provideHomeApi(client: OkHttpClient): HomeApi {
        return Retrofit.Builder().baseUrl(HomeApi.BASE_URL).client(client)
            .addConverterFactory(MoshiConverterFactory.create())
            .build().create(HomeApi::class.java)
    }

    @Singleton
    @Provides
    fun provideHomeRepository(
        dao: HomeDao,
        api: HomeApi,
        alarmHandler: AlarmHandler,
        workManager: WorkManager
    ): HomeRepository {
        return HomeRepositoryImpl(dao, api, alarmHandler, workManager)
    }

    @Singleton
    @Provides
    fun provideWorkManager(@ApplicationContext context: Context): WorkManager {
        return WorkManager.getInstance(context)
    }

    @Singleton
    @Provides
    fun provideAlarmHandler(@ApplicationContext context: Context): AlarmHandler {
        return AlarmHandlerImpl(context)
    }
}
