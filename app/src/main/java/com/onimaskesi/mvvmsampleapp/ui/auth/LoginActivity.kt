package com.onimaskesi.mvvmsampleapp.ui.auth

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.onimaskesi.mvvmsampleapp.R
import com.onimaskesi.mvvmsampleapp.data.db.AppDatabase
import com.onimaskesi.mvvmsampleapp.data.db.entities.User
import com.onimaskesi.mvvmsampleapp.data.network.RestApi
import com.onimaskesi.mvvmsampleapp.data.repositories.UserRepository
import com.onimaskesi.mvvmsampleapp.databinding.ActivityLoginBinding
import com.onimaskesi.mvvmsampleapp.ui.home.HomeActivity
import com.onimaskesi.mvvmsampleapp.util.*
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() , AuthListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_login) remove for binding

        val api = RestApi()
        val db = AppDatabase(this)
        val repository = UserRepository(api, db)
        val factory = AuthViewModelFactory(repository)

        val binding : ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewModel = ViewModelProvider(this, factory).get(AuthViewModel::class.java)

        viewModel.authListener = this

        binding.viewModel = viewModel

        viewModel.getLoggedInUser().observe(this, Observer { user ->
            if(user != null){
                Intent(this, HomeActivity::class.java).also {
                    //kullanıcı giriş yaptıktan sonra geri tuşuna basması halinde giriş kısmına tekrar geri dönmemesi için flagleri yerleştiriyoruz
                    it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    startActivity(it)
                }
            }
        })

    }

    override fun onStarted() {
        progress_bar.show()
    }

    override fun onSuccess(user: User) {
        progress_bar.hide()
    }

    override fun onFailure(message: String) {
        progress_bar.hide()
        root_layout.snackbar(message)
    }
}