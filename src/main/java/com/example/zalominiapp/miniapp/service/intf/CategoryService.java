package com.example.zalominiapp.miniapp.service.intf;

import com.example.zalominiapp.miniapp.dto.request.CategoryRequestDTO;
import com.example.zalominiapp.miniapp.dto.response.CategoryResponseDTO;

import java.util.List;

public interface CategoryService {
    CategoryResponseDTO createCategory(CategoryRequestDTO categoryRequestDTO);
    CategoryResponseDTO updateCategory(Long id, String name);
    Boolean deleteCategory(Long id);
    CategoryResponseDTO getCategoryByCategoryName(String name);
    List<CategoryResponseDTO> getAllCategories();
}
