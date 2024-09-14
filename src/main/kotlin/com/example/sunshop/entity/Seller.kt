package com.example.sunshop.entity

import jakarta.persistence.*

@Entity
data class Seller(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val description: String
)
