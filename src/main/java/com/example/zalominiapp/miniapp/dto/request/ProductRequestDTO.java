package com.example.zalominiapp.miniapp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDTO {
    private String name;
    private String description;
    private Double price;
    private Integer stockQuantity;
    private List<Long> categoryIds; // To link categories by their IDs
}
