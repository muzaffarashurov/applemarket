package com.spaces.applemarket.category.service;

import com.spaces.applemarket.category.mapper.CategoryMapper;
import com.spaces.applemarket.category.model.CategoryModel;
import com.spaces.applemarket.category.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<CategoryModel> getAll() {
        return categoryRepository.findAll().stream()
                .map(CategoryMapper::mapToModel)
                .toList();
    }
}
