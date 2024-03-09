package com.mkiperszmid.authentication_presentation.signup;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lcom/mkiperszmid/authentication_presentation/signup/SignupViewModel;", "Landroidx/lifecycle/ViewModel;", "signupUseCases", "Lcom/mkiperszmid/authentication_domain/usecase/SignupUseCases;", "(Lcom/mkiperszmid/authentication_domain/usecase/SignupUseCases;)V", "<set-?>", "Lcom/mkiperszmid/authentication_presentation/signup/SignupState;", "state", "getState", "()Lcom/mkiperszmid/authentication_presentation/signup/SignupState;", "setState", "(Lcom/mkiperszmid/authentication_presentation/signup/SignupState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "onEvent", "", "event", "Lcom/mkiperszmid/authentication_presentation/signup/SignupEvent;", "signUp", "authentication_presentation_debug"})
public final class SignupViewModel extends androidx.lifecycle.ViewModel {
    private final com.mkiperszmid.authentication_domain.usecase.SignupUseCases signupUseCases = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState state$delegate = null;
    
    @javax.inject.Inject
    public SignupViewModel(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.authentication_domain.usecase.SignupUseCases signupUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.mkiperszmid.authentication_presentation.signup.SignupState getState() {
        return null;
    }
    
    private final void setState(com.mkiperszmid.authentication_presentation.signup.SignupState p0) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.mkiperszmid.authentication_presentation.signup.SignupEvent event) {
    }
    
    private final void signUp() {
    }
}