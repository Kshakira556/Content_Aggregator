package com.example.aggregatorx.models

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "content")
data class Content(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    @NonNull
    val title: String,

    @NonNull
    val description: String,

    @NonNull
    val url: String
)
