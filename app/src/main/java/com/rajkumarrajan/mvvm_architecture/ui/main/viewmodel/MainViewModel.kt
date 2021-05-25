package com.rajkumarrajan.mvvm_architecture.ui.main.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.rajkumarrajan.mvvm_architecture.data.repository.MainRepository
import com.rajkumarrajan.mvvm_architecture.utils.Resource
import kotlinx.coroutines.Dispatchers

class MainViewModel @ViewModelInject constructor(
    private val mainRepository: MainRepository
) : ViewModel() {
    fun fetchUsers() = liveData(Dispatchers.IO) {
        emit(Resource.loading(null))
        try {
            emit(Resource.success(data = mainRepository.getUsers()))
        } catch (exception: Exception) {
            emit(Resource.error(exception.message ?: "Error Occurred!", data = null))
        }
    }
}