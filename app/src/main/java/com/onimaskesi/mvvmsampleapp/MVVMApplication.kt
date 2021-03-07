package com.onimaskesi.mvvmsampleapp

import android.app.Application
import com.onimaskesi.mvvmsampleapp.data.db.AppDatabase
import com.onimaskesi.mvvmsampleapp.data.network.NetworkConnectionInterceptor
import com.onimaskesi.mvvmsampleapp.data.network.RestApi
import com.onimaskesi.mvvmsampleapp.data.repositories.UserRepository
import com.onimaskesi.mvvmsampleapp.ui.auth.AuthViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider

class MVVMApplication : Application(), KodeinAware {

    override val kodein = Kodein.lazy{
        import(androidXModule(this@MVVMApplication))

        bind() from singleton { NetworkConnectionInterceptor(instance()) }
        bind() from singleton { RestApi(instance()) }
        bind() from singleton { AppDatabase(instance()) }
        bind() from singleton { UserRepository(instance() , instance()) }
        bind() from provider { AuthViewModelFactory(instance()) }

    }

}