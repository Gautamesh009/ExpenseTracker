package com.example.expensetraclerapp.Room

class PaymentRepo(val paymentDao: PaymentDao) {
    suspend fun insert(paymentHistory: PaymentHistory) {
        paymentDao.insert(paymentHistory)
    }
}