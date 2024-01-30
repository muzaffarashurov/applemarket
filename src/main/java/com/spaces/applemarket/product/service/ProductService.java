package com.spaces.applemarket.product.service;

import com.spaces.applemarket.product.mapper.ProductMapper;
import com.spaces.applemarket.product.model.ProductModel;
import com.spaces.applemarket.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    public List<ProductModel> getAllProducts() {
        return productRepository.findAll().stream()
                .map(ProductMapper::mapToModel)
                .toList();
    }
}
