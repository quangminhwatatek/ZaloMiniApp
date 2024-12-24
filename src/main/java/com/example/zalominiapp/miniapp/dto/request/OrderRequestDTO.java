package com.example.zalominiapp.miniapp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequestDTO {
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Long> getOrderItemIds() {
        return orderItemIds;
    }

    public void setOrderItemIds(List<Long> orderItemIds) {
        this.orderItemIds = orderItemIds;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public OrderRequestDTO() {
    }

    public OrderRequestDTO(Long userId, List<Long> orderItemIds, Double totalAmount, String orderStatus) {
        this.userId = userId;
        this.orderItemIds = orderItemIds;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
    }

    private Long userId; // ID of the user placing the order
    private List<Long> orderItemIds; // List of Order Item IDs
    private Double totalAmount; // Total order amount
    private String orderStatus; // Status of the order (e.g., "Pending", "Completed")
}
