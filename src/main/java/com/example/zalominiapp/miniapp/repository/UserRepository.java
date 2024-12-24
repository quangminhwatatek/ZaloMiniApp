package com.example.zalominiapp.miniapp.repository;

import com.example.zalominiapp.miniapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
