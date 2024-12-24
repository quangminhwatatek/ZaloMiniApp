package com.example.zalominiapp.miniapp.entity;

import jakarta.persistence.*;
import lombok.*;

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
    private java.util.Date paymentDate;

    private String paymentMethod;
    private String paymentStatus;
    private Double amount;
}

