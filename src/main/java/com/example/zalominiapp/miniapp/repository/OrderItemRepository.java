package com.example.zalominiapp.miniapp.repository;

import com.example.zalominiapp.miniapp.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
