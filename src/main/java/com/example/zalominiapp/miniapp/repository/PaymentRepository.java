package com.example.zalominiapp.miniapp.repository;

import com.example.zalominiapp.miniapp.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Custom queries (if any) can be added here
}
