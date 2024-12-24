package com.example.zalominiapp.miniapp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponseDTO {
    private Long productId;
    private String name;
    private String description;
    private Double price;
    private Integer stockQuantity;
    private Date createdAt;
    private List<String> categoryNames; // List of associated category names
}
