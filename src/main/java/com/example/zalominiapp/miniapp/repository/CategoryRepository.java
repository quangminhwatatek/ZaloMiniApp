package com.example.zalominiapp.miniapp.repository;

import com.example.zalominiapp.miniapp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
