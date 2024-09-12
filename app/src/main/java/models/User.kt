package com.example.aggregatorx.models

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.aggregatorx.utils.Converters

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    @NonNull
    val username: String,

    @NonNull
    val email: String,

    @TypeConverters(Converters::class)
    val preferences: String // JSON representation of user preferences
)
