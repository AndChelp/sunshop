package com.example.sunshop.service

import com.example.sunshop.entity.Product
import com.example.sunshop.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(
    private val productRepository: ProductRepository
) {
    fun getAllProducts(): List<Product> = productRepository.findAll()

    fun getProductById(id: Long): Product? = productRepository.findById(id).orElse(null)

    fun getProductsByCategory(categoryId: Long): List<Product> =
        productRepository.findAllByCategoryId(categoryId)
}

