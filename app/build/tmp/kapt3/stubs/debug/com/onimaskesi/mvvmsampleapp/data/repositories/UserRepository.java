package com.onimaskesi.mvvmsampleapp.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/onimaskesi/mvvmsampleapp/data/repositories/UserRepository;", "Lcom/onimaskesi/mvvmsampleapp/data/network/SafeApiRequest;", "api", "Lcom/onimaskesi/mvvmsampleapp/data/network/RestApi;", "db", "Lcom/onimaskesi/mvvmsampleapp/data/db/AppDatabase;", "(Lcom/onimaskesi/mvvmsampleapp/data/network/RestApi;Lcom/onimaskesi/mvvmsampleapp/data/db/AppDatabase;)V", "getUser", "Landroidx/lifecycle/LiveData;", "Lcom/onimaskesi/mvvmsampleapp/data/db/entities/User;", "saveUser", "", "user", "(Lcom/onimaskesi/mvvmsampleapp/data/db/entities/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userLogin", "Lcom/onimaskesi/mvvmsampleapp/data/network/responses/AuthResponse;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserRepository extends com.onimaskesi.mvvmsampleapp.data.network.SafeApiRequest {
    private final com.onimaskesi.mvvmsampleapp.data.network.RestApi api = null;
    private final com.onimaskesi.mvvmsampleapp.data.db.AppDatabase db = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object userLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.onimaskesi.mvvmsampleapp.data.network.responses.AuthResponse> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveUser(@org.jetbrains.annotations.NotNull()
    com.onimaskesi.mvvmsampleapp.data.db.entities.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.onimaskesi.mvvmsampleapp.data.db.entities.User> getUser() {
        return null;
    }
    
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.onimaskesi.mvvmsampleapp.data.network.RestApi api, @org.jetbrains.annotations.NotNull()
    com.onimaskesi.mvvmsampleapp.data.db.AppDatabase db) {
        super();
    }
}