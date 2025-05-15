package org.demo.booking.web.booking;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.demo.booking.services.AppointmentService;
import org.demo.booking.web.booking.data.AppointmentConfirmResponse;
import org.demo.booking.web.booking.data.AppointmentRequest;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/v1/book")
@RequiredArgsConstructor
@Slf4j
public class AppointmentController {

    private final AppointmentService  appointmentService;

    @PostMapping("/{accountId}")
    public Mono<AppointmentConfirmResponse> bookAppointment(@PathVariable final String accountId, @RequestBody AppointmentRequest appointmentRequest) {
            log.info("Booking appointment for accountId: {}", accountId);
        return appointmentService.bookAppointment(accountId,appointmentRequest);
    }


}
