package com.rms.api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pnr;
    private String status;
    private String dateOfJourney;

    @ManyToOne
    private Passenger passenger;

    @ManyToOne
    private Train train;
}