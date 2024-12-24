package com.example.zalominiapp.miniapp.repository;

import com.example.zalominiapp.miniapp.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    // Custom queries (if any) can be added here
}
