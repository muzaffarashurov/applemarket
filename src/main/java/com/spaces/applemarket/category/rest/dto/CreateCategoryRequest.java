package com.spaces.applemarket.category.rest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateCategoryRequest {
    private Long id;
    private String name;
}
