package com.example.zalominiapp.miniapp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCartRequestDTO {
    private Long userId;
    private Long productId;
    private Integer quantity; // The quantity of the product being added/updated
}
