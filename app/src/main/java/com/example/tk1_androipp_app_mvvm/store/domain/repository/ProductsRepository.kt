package com.example.tk1_androipp_app_mvvm.store.domain.repository

import arrow.core.Either
import com.example.tk1_androipp_app_mvvm.store.domain.model.NetworkError
import com.example.tk1_androipp_app_mvvm.store.domain.model.Product

interface ProductsRepository {

    suspend fun getProducts(): Either<NetworkError, List<Product>>

}