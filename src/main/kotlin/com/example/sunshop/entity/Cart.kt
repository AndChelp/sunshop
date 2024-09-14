package com.example.sunshop.entity

data class CartItem(
    val product: Product,
    var quantity: Int = 1
)

data class Cart(
    val items: MutableList<CartItem> = mutableListOf(),
    var total: Double = 0.0
)
