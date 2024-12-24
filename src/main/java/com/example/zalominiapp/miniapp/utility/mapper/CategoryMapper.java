//package com.example.zalominiapp.miniapp.utility.mapper;
//
//import com.example.zalominiapp.miniapp.dto.response.CategoryResponseDTO;
//import com.example.zalominiapp.miniapp.entity.Category;
//import com.example.zalominiapp.miniapp.entity.Product;
//
//import java.util.List;
//
//public class CategoryMapper {
//    public CategoryResponseDTO mapToResponse(Category category) {
//        List<String> productNames = category.getProducts().stream()
//                .map(Product::getName) // Assuming `Product` has a `productName` field
//                .toList();
//
//        return new CategoryResponseDTO(
//                category.getId(),
//                category.getCategoryName(),
//                productNames
//        );
//    }
//
//}
