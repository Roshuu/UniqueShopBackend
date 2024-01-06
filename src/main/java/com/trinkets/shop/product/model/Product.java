package com.trinkets.shop.product.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@AllArgsConstructor

public class Product {

    private String name;
    private String category;
    private String description;
    private BigDecimal price;
    private String currency;





}
