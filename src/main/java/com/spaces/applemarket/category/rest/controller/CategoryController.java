package com.spaces.applemarket.category.rest.controller;

import com.spaces.applemarket.category.mapper.CategoryMapper;
import com.spaces.applemarket.category.rest.dto.CategoryResponse;
import com.spaces.applemarket.category.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Category")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/category")
public class CategoryController {

    private final CategoryService categoryService;

    @Operation(summary = "View all category")
    @GetMapping("/")
    public List<CategoryResponse> getAllCategory() {
        return categoryService.getAll().stream()
                .map(CategoryMapper::mapToDto)
                .toList();
    }

}
