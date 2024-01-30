package com.spaces.applemarket.category.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CategoryModel {
    private Long id;
    private String name;
}
