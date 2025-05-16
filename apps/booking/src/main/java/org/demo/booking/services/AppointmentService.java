package org.demo.booking.services;

import org.demo.booking.web.booking.data.AppointmentConfirmResponse;
import org.demo.booking.web.booking.data.AppointmentRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AppointmentService {

    public AppointmentConfirmResponse bookAppointment( AppointmentRequest appointmentRequest) {
        //create a new customer
        try {
            // Simulate processing delay (e.g., DB/API call)
            Thread.sleep(300); // 2 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // restore interrupted status
            throw new IllegalStateException("Interrupted during simulated delay", e);
        }
        return new AppointmentConfirmResponse(
                UUID.randomUUID().toString(),
                UUID.randomUUID().toString(),
                UUID.randomUUID().toString(),
                true,
                "This is test");
    }




}
