package com.example.cart.controller;

import com.example.cart.model.Product;
import com.example.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/items")
    public List<Product> getItems() {
        return cartService.getAllItems();
    }

    @PostMapping("/add")
    public String addProduct(@RequestBody Product product) {
        cartService.addProduct(product);
        return "Product added to cart.";
    }

    @DeleteMapping("/remove/{name}")
    public String removeProduct(@PathVariable String name) {
        cartService.removeProduct(name);
        return "Product removed from cart.";
    }

    @PutMapping("/update/{name}")
    public String updateProduct(@PathVariable String name, @RequestBody Product product) {
        cartService.updateProduct(name, product);
        return "Product updated.";
    }

    @GetMapping("/total")
    public String getTotal() {
        return "Total Cart Value: ₹" + cartService.getTotalCost();
    }
}
