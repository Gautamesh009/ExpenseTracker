package com.example.expensetraclerapp.Room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PaymentHistory(
    val moneySpend : Int,
    val msg : String,
    val time : String,
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0
)
