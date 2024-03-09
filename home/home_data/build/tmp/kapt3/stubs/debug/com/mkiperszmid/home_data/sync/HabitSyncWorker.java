package com.mkiperszmid.home_data.sync;

import java.lang.System;

@androidx.hilt.work.HiltWorker
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/mkiperszmid/home_data/sync/HabitSyncWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "api", "Lcom/mkiperszmid/home_data/remote/HomeApi;", "dao", "Lcom/mkiperszmid/home_data/local/HomeDao;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/mkiperszmid/home_data/remote/HomeApi;Lcom/mkiperszmid/home_data/local/HomeDao;)V", "getContext", "()Landroid/content/Context;", "getWorkerParameters", "()Landroidx/work/WorkerParameters;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sync", "", "entity", "Lcom/mkiperszmid/home_data/local/entity/HabitSyncEntity;", "(Lcom/mkiperszmid/home_data/local/entity/HabitSyncEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "home_data_debug"})
public final class HabitSyncWorker extends androidx.work.CoroutineWorker {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.work.WorkerParameters workerParameters = null;
    private final com.mkiperszmid.home_data.remote.HomeApi api = null;
    private final com.mkiperszmid.home_data.local.HomeDao dao = null;
    
    @dagger.assisted.AssistedInject
    public HabitSyncWorker(@org.jetbrains.annotations.NotNull
    @dagger.assisted.Assisted
    android.content.Context context, @org.jetbrains.annotations.NotNull
    @dagger.assisted.Assisted
    androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_data.remote.HomeApi api, @org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_data.local.HomeDao dao) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.work.WorkerParameters getWorkerParameters() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        return null;
    }
    
    private final java.lang.Object sync(com.mkiperszmid.home_data.local.entity.HabitSyncEntity entity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}