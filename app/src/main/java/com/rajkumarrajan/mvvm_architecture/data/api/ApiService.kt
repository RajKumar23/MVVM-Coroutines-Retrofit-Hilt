package com.rajkumarrajan.mvvm_architecture.data.api

import com.rajkumarrajan.mvvm_architecture.data.model.User
import retrofit2.http.GET


interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>
}