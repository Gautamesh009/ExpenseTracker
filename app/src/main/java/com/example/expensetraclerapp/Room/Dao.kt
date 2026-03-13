package com.example.expensetraclerapp.Room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface PaymentDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(paymentHistory: PaymentHistory)

    @Query("SELECT * FROM PaymentHistory")
    fun getAll(): Flow<List<PaymentHistory>>
}