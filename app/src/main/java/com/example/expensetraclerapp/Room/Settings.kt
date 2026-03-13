package com.example.expensetraclerapp.Room

import androidx.room.Entity

@Entity
data class PaymentHistory(
    val moneySpend : Int,
    val msg : String,
    val time : String
)
