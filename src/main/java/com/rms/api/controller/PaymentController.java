package com.rms.api.controller;

import com.rms.api.dto.PaymentDTO;
import com.rms.api.entity.Payment;
import com.rms.api.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public Payment pay(@RequestBody PaymentDTO dto) {
        return paymentService.makePayment(dto);
    }
}
