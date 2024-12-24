package com.example.zalominiapp.miniapp.utility.mapper;

import com.example.zalominiapp.miniapp.dto.response.OrderItemResponseDTO;
import com.example.zalominiapp.miniapp.dto.response.OrderResponseDTO;
import com.example.zalominiapp.miniapp.dto.response.PaymentResponseDTO;
import com.example.zalominiapp.miniapp.entity.Order;

import java.util.List;

public class OrderMapper {
    public OrderResponseDTO mapToResponse(Order order) {
        List<OrderItemResponseDTO> orderItemDTOs = order.getOrderItems().stream()
                .map(orderItem -> new OrderItemResponseDTO(
                        orderItem.getOrderItemId(),
                        orderItem.getProduct().getProductId(),
                        orderItem.getProduct().getName(),
                        orderItem.getQuantity(),
                        orderItem.getPrice()
                ))
                .toList();

        PaymentResponseDTO paymentDTO = null;
        if (order.getPayment() != null) {
            paymentDTO = new PaymentResponseDTO(
                    order.getPayment().getPaymentId(),
                    order.getPayment().getPaymentMethod(),
                    order.getPayment().getAmount(),
                    order.getPayment().getPaymentStatus()
            );
        }

        return new OrderResponseDTO(
                order.getOrderId(),
                order.getUser().getUserId(),
                order.getUser().getName(), // Optionally include the user's name
                order.getOrderDate(),
                order.getTotalAmount(),
                order.getOrderStatus(),
                orderItemDTOs,
                paymentDTO
        );
    }

}
