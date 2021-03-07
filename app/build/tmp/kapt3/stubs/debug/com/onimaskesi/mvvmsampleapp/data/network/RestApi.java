package com.onimaskesi.mvvmsampleapp.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/onimaskesi/mvvmsampleapp/data/network/RestApi;", "", "userLogin", "Lretrofit2/Response;", "Lcom/onimaskesi/mvvmsampleapp/data/network/responses/AuthResponse;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface RestApi {
    public static final com.onimaskesi.mvvmsampleapp.data.network.RestApi.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "login")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object userLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.onimaskesi.mvvmsampleapp.data.network.responses.AuthResponse>> p2);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/onimaskesi/mvvmsampleapp/data/network/RestApi$Companion;", "", "()V", "invoke", "Lcom/onimaskesi/mvvmsampleapp/data/network/RestApi;", "networkConnectionInterceptor", "Lcom/onimaskesi/mvvmsampleapp/data/network/NetworkConnectionInterceptor;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.onimaskesi.mvvmsampleapp.data.network.RestApi invoke(@org.jetbrains.annotations.NotNull()
        com.onimaskesi.mvvmsampleapp.data.network.NetworkConnectionInterceptor networkConnectionInterceptor) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}