package com.example.zalominiapp.miniapp.repository;

import com.example.zalominiapp.miniapp.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Custom queries (if any) can be added here
}
