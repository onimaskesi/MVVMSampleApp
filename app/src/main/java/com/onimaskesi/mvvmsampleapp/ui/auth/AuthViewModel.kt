package com.onimaskesi.mvvmsampleapp.ui.auth

import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {
    var email: String? = null
    var password: String? = null

    var authListener : AuthListener? = null

    fun onLoginButtonClick(view  : View){
        authListener?.onStarted()
        if(email.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener?.onFailure("Invalid email or password!")
            return
        }

        //seccess
        authListener?.onSuccess()

    }
}