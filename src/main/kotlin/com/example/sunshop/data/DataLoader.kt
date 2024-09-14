package com.example.sunshop.data

import com.example.sunshop.entity.Category
import com.example.sunshop.entity.Product
import com.example.sunshop.entity.Seller
import com.example.sunshop.repository.CategoryRepository
import com.example.sunshop.repository.ProductRepository
import com.example.sunshop.repository.SellerRepository
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component

@Component
class DataLoader(
    private val categoryRepository: CategoryRepository,
    private val sellerRepository: SellerRepository,
    private val productRepository: ProductRepository
) {

//    @PostConstruct
//    fun loadData() {
//        // Создаем категории
//        val category1 = Category(name = "Одежда")
//        val category2 = Category(name = "Электроника")
//        val category3 = Category(name = "Еда")
//        categoryRepository.saveAll(listOf(category1, category2, category3))
//
//        // Создаем продавцов
//        val seller1 = Seller(name = "USA_SHOP", description = "Надежный американский продавец")
//        val seller2 = Seller(name = "EU_SHOP", description = "Европейский продавец высокого качества")
//        sellerRepository.saveAll(listOf(seller1, seller2))
//
//        // Создаем товары
//        val product1 = Product(
//            name = "Ботинок Lux",
//            description = "Высококачественный ботинок для альпинизма",
//            price = 120.0,
//            imageUrl = "/images/boot1.jpg",
//            category = category1,
//            seller = seller1
//        )
//
//        val product2 = Product(
//            name = "Электронные часы",
//            description = "Часы с сенсорным экраном и множеством функций",
//            price = 80.0,
//            imageUrl = "/images/watch.jpg",
//            category = category2,
//            seller = seller2
//        )
//
//        val product3 = Product(
//            name = "Пицца Маргарита",
//            description = "Классическая итальянская пицца",
//            price = 15.0,
//            imageUrl = "/images/pizza.jpg",
//            category = category3,
//            seller = seller1
//        )
//
//        productRepository.saveAll(listOf(product1, product2, product3))
//    }
}
