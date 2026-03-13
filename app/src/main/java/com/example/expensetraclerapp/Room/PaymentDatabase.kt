package com.example.expensetraclerapp.Room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlin.jvm.java

@Database(entities = [PaymentHistory::class], version = 1, exportSchema = false)
abstract class PaymentDatabase : RoomDatabase() {
    abstract fun paymentDao(): PaymentDao

    companion object {
        @Volatile
        private var Instance: PaymentDatabase? = null

        fun getDatabase(context: Context): PaymentDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    PaymentDatabase::class.java,
                    "Sample"
                ).build().also { Instance = it }
            }
        }
    }
}