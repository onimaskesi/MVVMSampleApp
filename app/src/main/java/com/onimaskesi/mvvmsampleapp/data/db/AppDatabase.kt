package com.onimaskesi.mvvmsampleapp.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.onimaskesi.mvvmsampleapp.data.db.entities.User

@Database(entities = [User::class] , version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getUserDao() : UserDao

    companion object {

        @Volatile //this variable visible for all the other threads
        private var instance : AppDatabase? = null
        private val LOCK = Any() // for make sure we do not create two instances of our Database

        operator fun invoke(context : Context) = instance ?: synchronized(LOCK){
            instance?:buildDatabase(context).also{
                instance = it
            }
        }

        private fun buildDatabase(context : Context) =
            Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "MyDatabase.db"
            ).build()

    }
}