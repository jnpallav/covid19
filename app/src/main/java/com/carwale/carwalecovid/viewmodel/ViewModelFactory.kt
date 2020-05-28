package com.carwale.carwalecovid.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.carwale.carwalecovid.services.repository.SummaryRepository

class ViewModelFactory() : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SummaryViewModel::class.java)) {
            return SummaryViewModel(SummaryRepository()) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}