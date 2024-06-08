package com.example.tk1_androipp_app_mvvm.store.presentation.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tk1_androipp_app_mvvm.util.EventBus
import kotlinx.coroutines.launch

fun ViewModel.sendEvent(event: Any) {
    viewModelScope.launch {
        EventBus.sendEvent(event)
    }
}