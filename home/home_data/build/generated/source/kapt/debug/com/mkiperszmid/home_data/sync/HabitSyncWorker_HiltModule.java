package com.mkiperszmid.home_data.sync;

import androidx.hilt.work.WorkerAssistedFactory;
import androidx.work.ListenableWorker;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
@InstallIn(SingletonComponent.class)
@OriginatingElement(
    topLevelClass = HabitSyncWorker.class
)
public interface HabitSyncWorker_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.mkiperszmid.home_data.sync.HabitSyncWorker")
  WorkerAssistedFactory<? extends ListenableWorker> bind(HabitSyncWorker_AssistedFactory factory);
}
