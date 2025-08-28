package com.example.sqlroom
import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface ReminderDao{
    //Crea (create):inserta un nuemro recordatorio

    @Insert
    suspend fun insert(reminder:Reminder)
    //Lee (Read): obtiene todos los recordatorios

    @Query("SELECT*FROM reminders ORDER BY id ASC")
    fun getAllReminders():LiveData<List<Reminder>>
    //Actualiza(Update):modifica un recordatorio existente

    @Update
    suspend fun update(reminder:Reminder)
    //Borra (Delete): elimina un recordatorio

    @Delete
    suspend fun delete(reminder:Reminder)

}
