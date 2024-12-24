//package com.example.zalominiapp.miniapp.utility.mapper;
//
//import com.example.zalominiapp.miniapp.dto.request.ProductRequestDTO;
//import com.example.zalominiapp.miniapp.dto.response.ProductResponseDTO;
//import com.example.zalominiapp.miniapp.entity.Category;
//import com.example.zalominiapp.miniapp.entity.Product;
//
//import java.util.List;
//
//public class ProductMapper {
//    public ProductResponseDTO mapToResponse(Product product) {
//        List<String> categoryNames = product.getCategories().stream()
//                .map(Category::getCategoryName) // Assuming Category has a categoryName field
//                .toList();
//
//        return new ProductResponseDTO(
//                product.getProductId(),
//                product.getName(),
//                product.getDescription(),
//                product.getPrice(),
//                product.getStockQuantity(),
//                product.getCreatedAt(),
//                categoryNames
//        );
//    }
//    public Product mapToEntity(ProductRequestDTO dto, List<Category> categories) {
//        Product product = new Product();
//        product.setName(dto.getName());
//        product.setDescription(dto.getDescription());
//        product.setPrice(dto.getPrice());
//        product.setStockQuantity(dto.getStockQuantity());
//        product.setCategories(categories); // Map categories from IDs
//        product.setCreatedAt(new java.util.Date()); // Set creation time
//        return product;
//    }
//
//}
