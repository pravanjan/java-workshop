package org.demo.booking.repository;

import org.demo.booking.web.booking.data.AppointmentConfirmResponse;
import org.springframework.stereotype.Repository;

@Repository
public class AppointmentRepository {
    public AppointmentConfirmResponse save() {
        return new AppointmentConfirmResponse("accountId",
                "customerId",
                "appointmentId",
                "status",
                "message");
    }
}
