package com.trinkets.shop.product.repository;

import com.trinkets.shop.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long> {
}
