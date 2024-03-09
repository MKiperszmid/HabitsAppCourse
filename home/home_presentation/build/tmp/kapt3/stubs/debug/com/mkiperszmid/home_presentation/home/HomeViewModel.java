package com.mkiperszmid.home_presentation.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/mkiperszmid/home_presentation/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "homeUseCases", "Lcom/mkiperszmid/home_domain/home/usecase/HomeUseCases;", "(Lcom/mkiperszmid/home_domain/home/usecase/HomeUseCases;)V", "currentDayJob", "Lkotlinx/coroutines/Job;", "<set-?>", "Lcom/mkiperszmid/home_presentation/home/HomeState;", "state", "getState", "()Lcom/mkiperszmid/home_presentation/home/HomeState;", "setState", "(Lcom/mkiperszmid/home_presentation/home/HomeState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "getHabits", "", "onEvent", "event", "Lcom/mkiperszmid/home_presentation/home/HomeEvent;", "home_presentation_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.mkiperszmid.home_domain.home.usecase.HomeUseCases homeUseCases = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState state$delegate = null;
    private kotlinx.coroutines.Job currentDayJob;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_domain.home.usecase.HomeUseCases homeUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.mkiperszmid.home_presentation.home.HomeState getState() {
        return null;
    }
    
    private final void setState(com.mkiperszmid.home_presentation.home.HomeState p0) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_presentation.home.HomeEvent event) {
    }
    
    private final void getHabits() {
    }
}