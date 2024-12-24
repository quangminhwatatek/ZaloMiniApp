package com.example.zalominiapp.miniapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @OneToOne
    @JoinColumn(name = "orderId")
    private Order order;

    @Column(name = "paymentDate")
    private LocalDate paymentDate;

    private String paymentMethod;
    private String paymentStatus;
    private Double amount;
}

