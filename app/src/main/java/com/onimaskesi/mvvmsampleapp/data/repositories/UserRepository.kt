package com.onimaskesi.mvvmsampleapp.data.repositories

import com.onimaskesi.mvvmsampleapp.data.db.AppDatabase
import com.onimaskesi.mvvmsampleapp.data.db.entities.User
import com.onimaskesi.mvvmsampleapp.data.network.RestApi
import com.onimaskesi.mvvmsampleapp.data.network.SafeApiRequest
import com.onimaskesi.mvvmsampleapp.data.network.responses.AuthResponse
import retrofit2.Response

class UserRepository(
    private val api : RestApi,
    private val db: AppDatabase
) : SafeApiRequest(){

    suspend fun userLogin(email : String, password : String) : AuthResponse {

        return apiRequest { api.userLogin(email, password)}

    }

    suspend fun saveUser(user : User) = db.getUserDao().upsert(user)

    fun getUser() = db.getUserDao().getUser()

}