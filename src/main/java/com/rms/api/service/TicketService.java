package com.rms.api.service;

import com.rms.api.dto.TicketBookingDTO;
import com.rms.api.entity.*;
import com.rms.api.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;
    private final PassengerRepository passengerRepository;
    private final TrainRepository trainRepository;

    public TicketService(TicketRepository ticketRepository,
                         PassengerRepository passengerRepository,
                         TrainRepository trainRepository) {
        this.ticketRepository = ticketRepository;
        this.passengerRepository = passengerRepository;
        this.trainRepository = trainRepository;
    }

    public Ticket bookTicket(TicketBookingDTO dto) {
        Passenger passenger = passengerRepository.findById(dto.getPassengerId()).orElseThrow();
        Train train = trainRepository.findById(dto.getTrainId()).orElseThrow();

        Ticket ticket = new Ticket();
        ticket.setPassenger(passenger);
        ticket.setTrain(train);
        ticket.setDateOfJourney(dto.getDateOfJourney());
        ticket.setStatus("BOOKED");
        ticket.setPnr(UUID.randomUUID().toString().substring(0, 8));

        return ticketRepository.save(ticket);
    }

    public Ticket cancelTicket(Long ticketId) {
        Ticket ticket = ticketRepository.findById(ticketId).orElseThrow();
        ticket.setStatus("CANCELLED");
        return ticketRepository.save(ticket);
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
}