package com.example.zalominiapp.miniapp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponseDTO {
    private Long orderId;
    private Long userId;
    private String userName; // Optionally include user's name
    private Date orderDate;
    private Double totalAmount;
    private String orderStatus;
    private List<OrderItemResponseDTO> orderItems; // List of order items
    private PaymentResponseDTO payment; // Payment details (if available)
}
