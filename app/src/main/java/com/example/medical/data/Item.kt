package com.example.medical.data

import android.icu.text.DateFormat
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

/**
 * Entity data class represents a single row in the database.
 */
@Entity(tableName = "items")
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val doctor: String,
    val test: String,
    val medicine: String,
    val editor: String,
    val date: String
)