package org.demo.booking.web.booking.data;

public record AppointmentConfirmResponse(
        String accountId,
        String customerId,
        String appointmentId,
        boolean status,
        String message
){
}
