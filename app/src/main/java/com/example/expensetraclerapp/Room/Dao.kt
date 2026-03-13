package com.example.expensetraclerapp.Room

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface PaymentDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(paymentHistory: PaymentHistory)

    @Query("SELECT * FROM PaymentHistory")
    suspend fun getAll(): List<PaymentHistory>

}