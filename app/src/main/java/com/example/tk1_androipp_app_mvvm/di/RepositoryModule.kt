package com.example.tk1_androipp_app_mvvm.di

import com.example.tk1_androipp_app_mvvm.store.data.repository.ProductsRepositoryImpl
import com.example.tk1_androipp_app_mvvm.store.domain.repository.ProductsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun provideProductsRepository(impl: ProductsRepositoryImpl): ProductsRepository

}