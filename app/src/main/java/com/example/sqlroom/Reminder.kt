package com.example.sqlroom
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="reminders")
data class Reminder(
    @PrimaryKey(true)
    val id: Int=0,
    val text:String,
    val isCompleted: Boolean
)