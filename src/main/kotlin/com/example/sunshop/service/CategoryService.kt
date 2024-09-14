package com.example.sunshop.service

import com.example.sunshop.entity.Category
import com.example.sunshop.repository.CategoryRepository
import org.springframework.stereotype.Service

@Service
class CategoryService(val categoryRepository: CategoryRepository) {
    fun getAllCategories(): List<Category> {
        return categoryRepository.findAll()
    }
}