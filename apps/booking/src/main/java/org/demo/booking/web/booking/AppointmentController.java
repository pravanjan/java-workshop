package org.demo.booking.web.booking;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.demo.booking.services.AppointmentService;
import org.demo.booking.web.booking.data.AppointmentConfirmResponse;
import org.demo.booking.web.booking.data.AppointmentRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1/appointments")
@RequiredArgsConstructor
@Slf4j
public class AppointmentController {

    private final AppointmentService  appointmentService;

    @PostMapping("")
    public AppointmentConfirmResponse bookAppointment(@RequestBody AppointmentRequest appointmentRequest) {
        log.info("Booking appointment for accountId: {}", appointmentRequest.appointmentTime());

        return appointmentService.bookAppointment(appointmentRequest);
    }


}
