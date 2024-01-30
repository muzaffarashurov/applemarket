package com.spaces.applemarket.category.mapper;

import com.spaces.applemarket.category.entity.Category;
import com.spaces.applemarket.category.model.CategoryModel;
import com.spaces.applemarket.category.rest.dto.CategoryResponse;

public class CategoryMapper {

    public static CategoryModel mapToModel(Category entity) {
        return CategoryModel.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }


    public static CategoryResponse mapToDto(CategoryModel model) {
        return CategoryResponse.builder()
                .id(model.getId())
                .name(model.getName())
                .build();
    }
}
