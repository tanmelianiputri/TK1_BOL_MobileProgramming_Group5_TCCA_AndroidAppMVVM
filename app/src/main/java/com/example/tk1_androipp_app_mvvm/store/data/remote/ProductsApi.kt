package com.example.tk1_androipp_app_mvvm.store.data.remote

import com.example.tk1_androipp_app_mvvm.store.domain.model.Product
import retrofit2.http.GET

interface ProductsApi {

    @GET("products")
    suspend fun getProducts(): List<Product>

}