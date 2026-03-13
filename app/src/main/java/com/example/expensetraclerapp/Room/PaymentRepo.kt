package com.example.expensetraclerapp.Room

import android.content.Context
import androidx.room.Room
import kotlinx.coroutines.flow.Flow

class PaymentRepo(val paymentDao: PaymentDao) {
    val getAllPayments: Flow<List<PaymentHistory>> = paymentDao.getAll()

    suspend fun insert(paymentHistory: PaymentHistory) {
        paymentDao.insert(paymentHistory)
    }

    companion object {
        fun getDatabase(context: Context): PaymentDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                PaymentDatabase::class.java,
                "payment_db"
            ).build()
        }
    }

}