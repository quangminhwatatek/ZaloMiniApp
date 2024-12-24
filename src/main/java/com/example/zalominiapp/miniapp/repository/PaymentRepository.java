package com.example.zalominiapp.miniapp.repository;

import com.example.zalominiapp.miniapp.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
