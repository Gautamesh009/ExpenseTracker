package com.example.noteapp

import android.app.Application
import android.content.Context
import com.example.expensetraclerapp.Room.PaymentRepo

class Container(private val context: Context) {
    val historyRepo : PaymentRepo by lazy {
        PaymentRepo(PaymentRepo.getDatabase(context).paymentDao())
    }
}

class UserApplication : Application() {
    lateinit var container: Container

    override fun onCreate() {
        super.onCreate()
        container = Container(this)
    }
}