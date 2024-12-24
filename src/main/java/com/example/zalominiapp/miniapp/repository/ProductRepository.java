package com.example.zalominiapp.miniapp.repository;

import com.example.zalominiapp.miniapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
