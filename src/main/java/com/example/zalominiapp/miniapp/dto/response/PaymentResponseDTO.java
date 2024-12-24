package com.example.zalominiapp.miniapp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponseDTO {
    private Long paymentId;
    private String paymentMethod; // e.g., "Credit Card", "PayPal"
    private Double amountPaid;
    private String paymentStatus; // e.g., "Completed", "Pending"
}
