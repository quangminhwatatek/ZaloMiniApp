package com.example.zalominiapp.miniapp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCartResponseDTO {
    private Long cartId;
    private Long userId;
    private String userName; // Optional, for displaying user's name
    private Long productId;
    private String productName; // Optional, for displaying product's name
    private Double productPrice; // Optional, for displaying product's price
    private Integer quantity;
    private LocalDate addedAt;
}
