package com.mkiperszmid.authentication_presentation.login;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/mkiperszmid/authentication_presentation/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "loginUseCases", "Lcom/mkiperszmid/authentication_domain/usecase/LoginUseCases;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/mkiperszmid/authentication_domain/usecase/LoginUseCases;Lkotlinx/coroutines/CoroutineDispatcher;)V", "<set-?>", "Lcom/mkiperszmid/authentication_presentation/login/LoginState;", "state", "getState", "()Lcom/mkiperszmid/authentication_presentation/login/LoginState;", "setState", "(Lcom/mkiperszmid/authentication_presentation/login/LoginState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "login", "", "onEvent", "event", "Lcom/mkiperszmid/authentication_presentation/login/LoginEvent;", "authentication_presentation_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.mkiperszmid.authentication_domain.usecase.LoginUseCases loginUseCases = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState state$delegate = null;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.authentication_domain.usecase.LoginUseCases loginUseCases, @org.jetbrains.annotations.NotNull
    @com.mkiperszmid.core_data.di.IoDispatcher
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.mkiperszmid.authentication_presentation.login.LoginState getState() {
        return null;
    }
    
    private final void setState(com.mkiperszmid.authentication_presentation.login.LoginState p0) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.authentication_presentation.login.LoginEvent event) {
    }
    
    private final void login() {
    }
}