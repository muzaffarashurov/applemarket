package com.spaces.applemarket.product.mapper;

import com.spaces.applemarket.product.entity.Product;
import com.spaces.applemarket.product.model.ProductModel;
import com.spaces.applemarket.product.rest.dto.ProductResponse;

public class ProductMapper {

    public static ProductModel mapToModel(Product entity) {
        return ProductModel.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .price(entity.getPrice())
                .categoryId(entity.getCategoryId())
                .imageUrl(entity.getImageUrl())
                .build();
    }

    public static ProductResponse mapToDto(ProductModel model) {
        return ProductResponse.builder()
                .id(model.getId())
                .title(model.getTitle())
                .price(model.getPrice())
                .categoryId(model.getCategoryId())
                .imageUrl(model.getImageUrl())
                .build();
    }
}
