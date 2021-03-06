package com.onimaskesi.mvvmsampleapp.data.repositories

import com.onimaskesi.mvvmsampleapp.data.network.RestApi
import com.onimaskesi.mvvmsampleapp.data.network.responses.AuthResponse
import retrofit2.Response

class UserRepository {

    suspend fun userLogin(email : String, password : String) : Response<AuthResponse> {
        return RestApi().userLogin(email, password)
    }

}