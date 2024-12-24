package com.example.zalominiapp.miniapp.utility.mapper;

import com.example.zalominiapp.miniapp.dto.request.OrderItemRequestDTO;
import com.example.zalominiapp.miniapp.dto.response.OrderItemResponseDTO;
import com.example.zalominiapp.miniapp.entity.Order;
import com.example.zalominiapp.miniapp.entity.OrderItem;
import com.example.zalominiapp.miniapp.entity.Product;

public class OrderItemMapper {
    public OrderItemResponseDTO mapToResponse(OrderItem orderItem) {
        return new OrderItemResponseDTO(
                orderItem.getOrderItemId(),
                orderItem.getOrder().getOrderId(),
                orderItem.getProduct().getProductId(),
                orderItem.getProduct().getName(), // Assuming Product has a `getName()` method
                orderItem.getQuantity(),
                orderItem.getPrice()
        );
    }
    public OrderItem mapToEntity(OrderItemRequestDTO dto, Order order, Product product) {
        OrderItem orderItem = new OrderItem();
        orderItem.setOrder(order); // Set the order object (fetched from the database by orderId)
        orderItem.setProduct(product); // Set the product object (fetched from the database by productId)
        orderItem.setQuantity(dto.getQuantity());
        orderItem.setPrice(dto.getPrice());
        return orderItem;
    }

}
