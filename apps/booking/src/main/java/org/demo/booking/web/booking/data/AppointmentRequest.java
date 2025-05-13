package org.demo.booking.web.booking.data;

import java.time.LocalDateTime;

public record AppointmentRequest(
        String customerName,
        String customerEmail,
        String serviceType,
        LocalDateTime appointmentTime
) {}
