package org.demo.booking.repository.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Appointment {
    private String accountId;
    private String customerId;
    private String appointmentId;
    private LocalDateTime appointmentTime;
    private String service;
    private String message;


}
