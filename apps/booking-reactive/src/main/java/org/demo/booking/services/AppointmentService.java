package org.demo.booking.services;

import lombok.RequiredArgsConstructor;
import org.demo.booking.repository.AppointmentRepository;
import org.demo.booking.web.booking.data.AppointmentConfirmResponse;
import org.demo.booking.web.booking.data.AppointmentRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final WebClient webClient;

    public Mono<AppointmentConfirmResponse> bookAppointment(String accountId, AppointmentRequest appointmentRequest) {
        return Mono
                .delay(Duration.ofMillis(300)) // simulate I/O or processing delay
                .map(ignore -> new AppointmentConfirmResponse(
                        accountId,
                        UUID.randomUUID().toString(),
                        UUID.randomUUID().toString(),
                        true,
                        "This is test"
                ));
    }




}
