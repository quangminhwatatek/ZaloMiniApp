package com.example.zalominiapp.miniapp.repository;

import com.example.zalominiapp.miniapp.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
