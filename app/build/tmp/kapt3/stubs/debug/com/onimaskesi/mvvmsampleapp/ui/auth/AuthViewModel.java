package com.onimaskesi.mvvmsampleapp.ui.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/onimaskesi/mvvmsampleapp/ui/auth/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/onimaskesi/mvvmsampleapp/data/repositories/UserRepository;", "(Lcom/onimaskesi/mvvmsampleapp/data/repositories/UserRepository;)V", "authListener", "Lcom/onimaskesi/mvvmsampleapp/ui/auth/AuthListener;", "getAuthListener", "()Lcom/onimaskesi/mvvmsampleapp/ui/auth/AuthListener;", "setAuthListener", "(Lcom/onimaskesi/mvvmsampleapp/ui/auth/AuthListener;)V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "password", "getPassword", "setPassword", "getLoggedInUser", "Landroidx/lifecycle/LiveData;", "Lcom/onimaskesi/mvvmsampleapp/data/db/entities/User;", "onLoginButtonClick", "", "view", "Landroid/view/View;", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String email;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String password;
    @org.jetbrains.annotations.Nullable()
    private com.onimaskesi.mvvmsampleapp.ui.auth.AuthListener authListener;
    private final com.onimaskesi.mvvmsampleapp.data.repositories.UserRepository repository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.onimaskesi.mvvmsampleapp.ui.auth.AuthListener getAuthListener() {
        return null;
    }
    
    public final void setAuthListener(@org.jetbrains.annotations.Nullable()
    com.onimaskesi.mvvmsampleapp.ui.auth.AuthListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.onimaskesi.mvvmsampleapp.data.db.entities.User> getLoggedInUser() {
        return null;
    }
    
    public final void onLoginButtonClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    com.onimaskesi.mvvmsampleapp.data.repositories.UserRepository repository) {
        super();
    }
}