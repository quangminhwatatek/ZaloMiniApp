package com.example.zalominiapp.miniapp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemRequestDTO {
    private Long orderId; // ID of the order this item belongs to
    private Long productId; // ID of the product being added to the order
    private Integer quantity; // Quantity of the product in the order
    private Double price; // Price of the product in the order
}
