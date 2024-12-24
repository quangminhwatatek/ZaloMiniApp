package com.example.zalominiapp.miniapp.repository;

import com.example.zalominiapp.miniapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom queries (if any) can be added here
}
