package com.example.expensetraclerapp.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.expensetraclerapp.Room.PaymentHistory
import com.example.expensetraclerapp.Room.PaymentRepo
import com.example.noteapp.UserApplication
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class TrackerViewModel(private val paymentRepo: PaymentRepo) : ViewModel() {
    val allPayments: StateFlow<List<PaymentHistory>> = paymentRepo.getAllPayments
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )

    fun insert(paymentHistory: PaymentHistory) {
        viewModelScope.launch {          // ← needed because insert is suspend
            paymentRepo.insert(paymentHistory)
        }
    }

    companion object{
        val Factory : ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as UserApplication)
                TrackerViewModel(application.container.historyRepo)
            }
        }
    }
}