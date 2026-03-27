package com.rms.api.service;

import com.rms.api.dto.PaymentDTO;
import com.rms.api.entity.Payment;
import com.rms.api.entity.Ticket;
import com.rms.api.repository.PaymentRepository;
import com.rms.api.repository.TicketRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;
    private final TicketRepository ticketRepository;

    public PaymentService(PaymentRepository paymentRepository,
                          TicketRepository ticketRepository) {
        this.paymentRepository = paymentRepository;
        this.ticketRepository = ticketRepository;
    }

    public Payment makePayment(PaymentDTO dto) {
        Ticket ticket = ticketRepository.findById(dto.getTicketId()).orElseThrow();

        Payment payment = new Payment();
        payment.setTicket(ticket);
        payment.setAmount(dto.getAmount());
        payment.setPaymentMethod(dto.getPaymentMethod());

        return paymentRepository.save(payment);
    }
}
