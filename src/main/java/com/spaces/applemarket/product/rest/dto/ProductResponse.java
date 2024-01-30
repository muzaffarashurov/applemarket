package com.spaces.applemarket.product.rest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class ProductResponse {

    private Long id;
    private String title;
    private BigDecimal price;
    private Long categoryId;
    private String imageUrl;
}
