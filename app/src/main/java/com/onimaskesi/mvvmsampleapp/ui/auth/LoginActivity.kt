package com.onimaskesi.mvvmsampleapp.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.onimaskesi.mvvmsampleapp.R
import com.onimaskesi.mvvmsampleapp.data.db.entities.User
import com.onimaskesi.mvvmsampleapp.databinding.ActivityLoginBinding
import com.onimaskesi.mvvmsampleapp.util.*
import kotlinx.android.synthetic.main.activity_login.*

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
        progress_bar.show()
    }

    override fun onSuccess(user: User) {
        progress_bar.hide()

        root_layout.snackbar("${user.name} is Logged In!")

    }

    override fun onFailure(message: String) {
        progress_bar.hide()
        root_layout.snackbar(message)
    }
}