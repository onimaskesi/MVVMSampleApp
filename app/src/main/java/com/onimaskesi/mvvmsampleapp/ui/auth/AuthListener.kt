package com.onimaskesi.mvvmsampleapp.ui.auth

import com.onimaskesi.mvvmsampleapp.data.db.entities.User

interface AuthListener {
    fun onStarted()
    fun onSuccess(user: User)
    fun onFailure(message: String)
}