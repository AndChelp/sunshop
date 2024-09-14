package com.example.sunshop.controller

import com.example.sunshop.entity.Cart
import com.example.sunshop.entity.CartItem
import com.example.sunshop.service.ProductService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
@SessionAttributes("cart")
class CartController(
    private val productService: ProductService
) {

    @ModelAttribute("cart")
    fun cart(): Cart = Cart()

    @PostMapping("/cart/add/{productId}")
    fun addToCart(
        @PathVariable productId: Long,
        @ModelAttribute cart: Cart
    ): String {
        val product = productService.getProductById(productId)
        product?.let {
            val existingItem = cart.items.find { item -> item.product.id == it.id }
            if (existingItem != null) {
                existingItem.quantity++
            } else {
                cart.items.add(CartItem(it))
            }
            cart.total += it.price
        }
        return "redirect:/cart"
    }

    @GetMapping("/cart")
    fun viewCart(@ModelAttribute cart: Cart, model: Model): String {
        model.addAttribute("cart", cart)
        return "cart"
    }

    @PostMapping("/cart/checkout")
    fun checkout(@ModelAttribute cart: Cart): String {
        // Очистка корзины
        cart.items.clear()
        cart.total = 0.0
        return "redirect:/"
    }
}

