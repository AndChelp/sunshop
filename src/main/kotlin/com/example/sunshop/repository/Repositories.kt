package com.example.sunshop.repository

import com.example.sunshop.entity.Category
import com.example.sunshop.entity.Product
import com.example.sunshop.entity.Seller
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository : JpaRepository<Category, Long>
interface SellerRepository : JpaRepository<Seller, Long>
interface ProductRepository : JpaRepository<Product, Long> {
    fun findAllByCategoryId(categoryId: Long): List<Product>
}
