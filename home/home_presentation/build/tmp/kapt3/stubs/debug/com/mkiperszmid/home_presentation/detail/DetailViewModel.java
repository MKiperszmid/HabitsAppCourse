package com.mkiperszmid.home_presentation.detail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/mkiperszmid/home_presentation/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "detailUseCases", "Lcom/mkiperszmid/home_domain/detail/usecase/DetailUseCases;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/mkiperszmid/home_domain/detail/usecase/DetailUseCases;)V", "<set-?>", "Lcom/mkiperszmid/home_presentation/detail/DetailState;", "state", "getState", "()Lcom/mkiperszmid/home_presentation/detail/DetailState;", "setState", "(Lcom/mkiperszmid/home_presentation/detail/DetailState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "onEvent", "", "event", "Lcom/mkiperszmid/home_presentation/detail/DetailEvent;", "home_presentation_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final com.mkiperszmid.home_domain.detail.usecase.DetailUseCases detailUseCases = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState state$delegate = null;
    
    @javax.inject.Inject
    public DetailViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_domain.detail.usecase.DetailUseCases detailUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.mkiperszmid.home_presentation.detail.DetailState getState() {
        return null;
    }
    
    private final void setState(com.mkiperszmid.home_presentation.detail.DetailState p0) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.home_presentation.detail.DetailEvent event) {
    }
}