package com.example.tk1_androipp_app_mvvm.store.data.repository

import arrow.core.Either
import com.example.tk1_androipp_app_mvvm.store.data.mapper.toGeneralError
import com.example.tk1_androipp_app_mvvm.store.data.remote.ProductsApi
import com.example.tk1_androipp_app_mvvm.store.domain.model.NetworkError
import com.example.tk1_androipp_app_mvvm.store.domain.model.Product
import com.example.tk1_androipp_app_mvvm.store.domain.repository.ProductsRepository
import javax.inject.Inject

class ProductsRepositoryImpl @Inject constructor(
    private val productsApi: ProductsApi
) : ProductsRepository {
    override suspend fun getProducts(): Either<NetworkError, List<Product>> {
        return Either.catch {
            productsApi.getProducts()
        }.mapLeft { it.toGeneralError() }
    }
}