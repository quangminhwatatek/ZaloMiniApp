package com.example.zalominiapp.miniapp.service.impl;

import com.example.zalominiapp.miniapp.dto.request.CategoryRequestDTO;
import com.example.zalominiapp.miniapp.dto.response.CategoryResponseDTO;
import com.example.zalominiapp.miniapp.entity.Category;
import com.example.zalominiapp.miniapp.repository.CategoryRepository;
import com.example.zalominiapp.miniapp.service.intf.CategoryService;
import com.example.zalominiapp.miniapp.utility.mapper.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public CategoryResponseDTO createCategory(CategoryRequestDTO categoryRequestDTO) {

        if (categoryRequestDTO.getCategoryName() == null) {
            return null;
        }

        Category category = categoryMapper.mapToEntity(categoryRequestDTO);
        Category savedCategory = categoryRepository.save(category);

        return categoryMapper.mapToResponse(savedCategory);
    }

    @Override
    public CategoryResponseDTO updateCategory(Long id, String name) {
        return null;
    }

    @Override
    public Boolean deleteCategory(Long id) {
        return null;
    }

    @Override
    public CategoryResponseDTO getCategoryByCategoryName(String name) {
        return null;
    }

    @Override
    public List<CategoryResponseDTO> getAllCategories() {
        return List.of();
    }
}
