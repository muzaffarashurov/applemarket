package com.spaces.applemarket.product.rest.controller;

import com.spaces.applemarket.product.mapper.ProductMapper;
import com.spaces.applemarket.product.rest.dto.ProductResponse;
import com.spaces.applemarket.product.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Product")
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @Operation(summary = "View all products")
    @GetMapping("/all")
    public List<ProductResponse> getAll() {
        return productService.getAllProducts().stream()
                .map(ProductMapper::mapToDto)
                .toList();
    }

}
