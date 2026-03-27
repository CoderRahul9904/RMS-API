package com.rms.api.dto;

import lombok.Data;

@Data
public class PaymentDTO {
    private Long ticketId;
    private double amount;
    private String paymentMethod;
}