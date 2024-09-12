package com.example.aggregatorx.models

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sources")
data class Source(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    @NonNull
    val name: String,

    @NonNull
    val type: String, // e.g., "API", "RSS", "Website"

    @NonNull
    val url: String
)
