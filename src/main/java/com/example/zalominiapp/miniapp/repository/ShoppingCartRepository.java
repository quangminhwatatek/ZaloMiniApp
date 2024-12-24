package com.example.zalominiapp.miniapp.repository;

import com.example.zalominiapp.miniapp.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
}
