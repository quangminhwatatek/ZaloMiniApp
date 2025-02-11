package com.example.zalominiapp.miniapp.utility.mapper;

import com.example.zalominiapp.miniapp.dto.request.CategoryRequestDTO;
import com.example.zalominiapp.miniapp.dto.response.CategoryResponseDTO;
import com.example.zalominiapp.miniapp.entity.Category;
import com.example.zalominiapp.miniapp.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CategoryMapper {
    public CategoryResponseDTO mapToResponse(Category category) {
        List<String> productNames = category.getProducts().stream()
                .map(Product::getName) // Assuming `Product` has a `productName` field
                .toList();

        return new CategoryResponseDTO(
                category.getId(),
                category.getCategoryName(),
                productNames
        );
    }

    public Category mapToEntity(CategoryRequestDTO categoryRequestDTO) {
        Category category = new Category();
        category.setCategoryName(categoryRequestDTO.getCategoryName());

        return category;
    }
}
