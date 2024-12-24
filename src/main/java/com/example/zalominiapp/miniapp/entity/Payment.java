package com.example.zalominiapp.miniapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

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
    private Date paymentDate;

    private String paymentMethod;
    private String paymentStatus;
    private Double amount;
}

