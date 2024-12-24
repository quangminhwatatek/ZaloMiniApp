package com.example.zalominiapp.miniapp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequestDTO {
    private Long userId; // ID of the user placing the order
    private List<Long> orderItemIds; // List of Order Item IDs
    private Double totalAmount; // Total order amount
    private String orderStatus; // Status of the order (e.g., "Pending", "Completed")
}
