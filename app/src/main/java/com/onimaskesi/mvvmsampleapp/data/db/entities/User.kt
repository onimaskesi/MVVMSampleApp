package com.onimaskesi.mvvmsampleapp.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


const val CURRENT_USER_ID = 0

@Entity
data class User(var _id: Int? = null,
                var name : String? = null,
                var email: String? = null,
                var password: String? = null,
                var email_verified_at: String? = null,
                var created_at: String? = null,
                var updated_at: String? = null)
{
    var id : Int?
        get() = _id
        set(value) {
            _id = value
        }

    @PrimaryKey(autoGenerate = false)
    var uid: Int = CURRENT_USER_ID
}




