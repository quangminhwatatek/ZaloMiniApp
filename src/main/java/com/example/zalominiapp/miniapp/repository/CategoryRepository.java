package com.example.zalominiapp.miniapp.repository;

import com.example.zalominiapp.miniapp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Custom queries (if any) can be added here
}

