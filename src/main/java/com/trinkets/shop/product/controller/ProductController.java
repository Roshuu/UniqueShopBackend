package com.trinkets.shop.product.controller;

import com.trinkets.shop.product.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController

public class ProductController {





    @GetMapping("/products")
    public List<?> productList(){
        return List.of(
                new Product("Super", "Kategoria1", "Ekstra najlepsze na swieicie", new BigDecimal(12.44), "PLN"),
                new Product("Super", "Kategoria1", "Ekstra najlepsze na swieicie", new BigDecimal(13.44), "PLN"),
                new Product("Super", "Kategoria1", "Ekstra najlepsze na swieicie", new BigDecimal(14.44), "PLN"));
    }
}
