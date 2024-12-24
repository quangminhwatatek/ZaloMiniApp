package com.example.zalominiapp.miniapp.utility.generic;

public enum OrderStatus {
    PENDING("Pending"),
    COMPLETED("Completed"),
    CANCELED("Canceled"),
    SHIPPED("Shipped"),
    DELIVERED("Delivered"),
    RETURNED("Returned");

    private final String status;

    OrderStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
