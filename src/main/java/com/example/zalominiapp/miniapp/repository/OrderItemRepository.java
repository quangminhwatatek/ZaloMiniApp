package com.example.zalominiapp.miniapp.repository;

import com.example.zalominiapp.miniapp.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    // Custom queries (if any) can be added here
}
