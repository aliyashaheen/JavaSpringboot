package com.example.cart.service;

import com.example.cart.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CartService {
    private final List<Product> cart = new ArrayList<>();

    public List<Product> getAllItems() {
        return cart;
    }

    public void addProduct(Product product) {
        cart.add(product);
    }

    public void removeProduct(String name) {
        cart.removeIf(p -> p.getName().equalsIgnoreCase(name));
    }

    public void updateProduct(String name, Product updatedProduct) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getName().equalsIgnoreCase(name)) {
                cart.set(i, updatedProduct);
                break;
            }
        }
    }

    public double getTotalCost() {
        return cart.stream().mapToDouble(Product::getTotal).sum();
    }
}
