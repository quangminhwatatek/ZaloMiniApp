package com.example.zalominiapp.miniapp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemResponseDTO {
    private Long orderItemId; // Unique ID for the order item
    private Long orderId; // The ID of the order
    private Long productId; // The ID of the product in the order
    private String productName; // Name of the product in the order
    private Integer quantity; // Quantity of the product in the order
    private Double price; // Price of the product in the order
}
