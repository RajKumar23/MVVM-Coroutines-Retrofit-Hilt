package com.rajkumarrajan.mvvm_architecture.di

import com.rajkumarrajan.mvvm_architecture.data.api.ApiService
import com.rajkumarrajan.mvvm_architecture.data.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
object DataRepositoryModule {

    @Provides
    fun provideDataRepository(apiService: ApiService): MainRepository {
        return MainRepository(apiService)
    }
}