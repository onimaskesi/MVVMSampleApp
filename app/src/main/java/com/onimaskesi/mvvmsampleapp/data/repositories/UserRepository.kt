package com.onimaskesi.mvvmsampleapp.data.repositories

import com.onimaskesi.mvvmsampleapp.data.network.RestApi
import com.onimaskesi.mvvmsampleapp.data.network.SafeApiRequest
import com.onimaskesi.mvvmsampleapp.data.network.responses.AuthResponse
import retrofit2.Response

class UserRepository : SafeApiRequest(){

    suspend fun userLogin(email : String, password : String) : AuthResponse {

        return apiRequest { RestApi().userLogin(email, password)}

    }

}