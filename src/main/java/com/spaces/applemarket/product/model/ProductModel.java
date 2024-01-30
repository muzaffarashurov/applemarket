package com.spaces.applemarket.product.model;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
@Getter
@Builder
public class ProductModel {
    private Long id;
    private String title;
    private BigDecimal price;
    private Long categoryId;
    private String imageUrl;
}
