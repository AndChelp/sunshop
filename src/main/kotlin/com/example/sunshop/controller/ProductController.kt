package com.example.sunshop.controller

import com.example.sunshop.service.CategoryService
import com.example.sunshop.service.ProductService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam

@Controller
class ProductController(
    private val productService: ProductService,
    private val categoryService: CategoryService
) {

    @GetMapping("/")
    fun viewProducts(
        @RequestParam(required = false) category: Long?,
        model: Model
    ): String {
        val categories = categoryService.getAllCategories()
        val products = if (category != null) {
            productService.getProductsByCategory(category)
        } else {
            productService.getAllProducts()
        }

        model.addAttribute("categories", categories)
        model.addAttribute("selectedCategory", category)
        model.addAttribute("products", products)
        return "index"
    }

    @GetMapping("/product/{id}")
    fun viewProduct(@PathVariable id: Long, model: Model): String {
        val product = productService.getProductById(id)
        product?.let {
            model.addAttribute("product", it)
            return "product"
        }
        return "error"
    }
}
