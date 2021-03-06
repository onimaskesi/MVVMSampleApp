package com.onimaskesi.mvvmsampleapp.data.network.responses

import com.onimaskesi.mvvmsampleapp.data.db.entities.User

data class AuthResponse(
    val isSuccessful: Boolean?,
    val message: String?,
    val user : User?
)