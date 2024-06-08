package com.example.tk1_androipp_app_mvvm.store.presentation.products_screen

import com.example.tk1_androipp_app_mvvm.store.domain.model.Product

data class ProductsViewState(
    val isLoading: Boolean = false,
    val products: List<Product> = emptyList(),
    val error: String? = null
)