package com.example.sunshop.entity

import jakarta.persistence.*

@Entity
data class Product(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val description: String,
    val price: Double,
    val imageUrl: String,
    @ManyToOne
    val category: Category,
    @ManyToOne
    val seller: Seller
)
