package com.rms.api.controller;

import com.rms.api.dto.TicketBookingDTO;
import com.rms.api.entity.Ticket;
import com.rms.api.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/book")
    public Ticket book(@RequestBody TicketBookingDTO dto) {
        return ticketService.bookTicket(dto);
    }

    @PutMapping("/cancel/{id}")
    public Ticket cancel(@PathVariable Long id) {
        return ticketService.cancelTicket(id);
    }

    @GetMapping
    public List<Ticket> allTickets() {
        return ticketService.getAllTickets();
    }
}
