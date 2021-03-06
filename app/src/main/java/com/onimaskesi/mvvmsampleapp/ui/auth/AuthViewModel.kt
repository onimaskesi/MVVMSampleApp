package com.onimaskesi.mvvmsampleapp.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.onimaskesi.mvvmsampleapp.data.repositories.UserRepository
import com.onimaskesi.mvvmsampleapp.util.ApiException
import com.onimaskesi.mvvmsampleapp.util.Coroutines

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

        Coroutines.main{

            try {
                val authResponse = UserRepository().userLogin(email!!, password!!)

                authResponse.user?.let{
                    authListener?.onSuccess(it)
                    return@main
                }
                authListener?.onFailure(authResponse.message!!)

            }catch (e : ApiException){
                authListener?.onFailure(e.message!!)
            }


        }

    }
}