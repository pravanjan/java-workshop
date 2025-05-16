package org.demo.booking.services;

import org.demo.booking.web.booking.data.AppointmentConfirmResponse;
import org.demo.booking.web.booking.data.AppointmentRequest;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.UUID;

@Service
public class AppointmentService {

    public Mono<AppointmentConfirmResponse> bookAppointment(AppointmentRequest appointmentRequest) {
        return Mono
                .delay(Duration.ofMillis(300)) // simulate I/O or processing delay
                .map(ignore -> new AppointmentConfirmResponse(
                        UUID.randomUUID().toString(),
                        UUID.randomUUID().toString(),
                        UUID.randomUUID().toString(),
                        true,
                        "This is test"
                ));
    }




}
