package org.demo.booking.services;

import lombok.RequiredArgsConstructor;
import org.demo.booking.repository.AppointmentRepository;
import org.demo.booking.web.booking.data.AppointmentConfirmResponse;
import org.demo.booking.web.booking.data.AppointmentRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final RestTemplate restTemplate;

    public AppointmentConfirmResponse bookAppointment(String accountId, AppointmentRequest appointmentRequest) {
        //create a new customer
        try {
            // Simulate processing delay (e.g., DB/API call)
            Thread.sleep(300); // 2 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // restore interrupted status
            throw new IllegalStateException("Interrupted during simulated delay", e);
        }
        return new AppointmentConfirmResponse(
                accountId,
                UUID.randomUUID().toString(),
                UUID.randomUUID().toString(),
                true,
                "This is test");
    }




}
