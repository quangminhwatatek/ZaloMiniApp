package com.example.zalominiapp.miniapp.repository;

import com.example.zalominiapp.miniapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom queries (if any) can be added here
}
