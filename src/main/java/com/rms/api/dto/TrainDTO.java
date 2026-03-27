package com.rms.api.dto;

import lombok.Data;

@Data
public class TrainDTO {
    private String trainName;
    private String source;
    private String destination;
    private int seatsAvailable;
}