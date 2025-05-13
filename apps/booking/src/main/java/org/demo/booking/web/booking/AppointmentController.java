package org.demo.booking.web.booking;

import lombok.RequiredArgsConstructor;
import org.demo.booking.services.AppointmentService;
import org.demo.booking.web.booking.data.AppointmentConfirmResponse;
import org.demo.booking.web.booking.data.AppointmentRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1/book")
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentService  appointmentService;

    @PostMapping("/{accountId}")
    public AppointmentConfirmResponse bookAppointment(@PathVariable final String accountId, @RequestBody AppointmentRequest appointmentRequest) {

        return appointmentService.bookAppointment(accountId,appointmentRequest);
    }


}
