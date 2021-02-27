package com.onimaskesi.mvvmsampleapp.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.onimaskesi.mvvmsampleapp.R
import com.onimaskesi.mvvmsampleapp.databinding.ActivityLoginBinding
import com.onimaskesi.mvvmsampleapp.util.toast

class LoginActivity : AppCompatActivity() , AuthListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_login) remove for binding

        val binding : ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)

        viewModel.authListener = this

        binding.viewModel = viewModel

    }

    override fun onStarted() {
        toast("Login Start")
    }

    override fun onSuccess() {
        toast("Login Success")
    }

    override fun onFailure(message: String) {
        toast(message)
    }
}