package com.rms.api.dto;

import lombok.Data;

@Data
public class TicketBookingDTO {
    private Long passengerId;
    private Long trainId;
    private String dateOfJourney;
}