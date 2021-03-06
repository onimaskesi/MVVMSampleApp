package com.onimaskesi.mvvmsampleapp.ui.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/onimaskesi/mvvmsampleapp/ui/auth/AuthListener;", "", "onFailure", "", "message", "", "onStarted", "onSuccess", "user", "Lcom/onimaskesi/mvvmsampleapp/data/db/entities/User;", "app_debug"})
public abstract interface AuthListener {
    
    public abstract void onStarted();
    
    public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
    com.onimaskesi.mvvmsampleapp.data.db.entities.User user);
    
    public abstract void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
}