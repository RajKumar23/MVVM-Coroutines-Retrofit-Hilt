package com.rajkumarrajan.mvvm_architecture.data.model

import com.google.gson.annotations.SerializedName

data class User(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("avatar")
    val avatar: String? = null,

    @field:SerializedName("email")
    val email: String? = null
)