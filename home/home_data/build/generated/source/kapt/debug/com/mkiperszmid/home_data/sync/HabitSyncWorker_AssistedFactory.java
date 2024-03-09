package com.mkiperszmid.home_data.sync;

import androidx.hilt.work.WorkerAssistedFactory;
import dagger.assisted.AssistedFactory;

@AssistedFactory
public interface HabitSyncWorker_AssistedFactory extends WorkerAssistedFactory<HabitSyncWorker> {
}
