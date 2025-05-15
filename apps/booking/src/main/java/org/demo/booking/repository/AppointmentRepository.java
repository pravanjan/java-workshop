package org.demo.booking.repository;

import org.demo.booking.services.CustomerConfirmResponse;
import org.demo.booking.web.booking.data.AppointmentConfirmResponse;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class AppointmentRepository {
    public AppointmentConfirmResponse save(CustomerConfirmResponse customerConfirmResponse) {
        return new AppointmentConfirmResponse(customerConfirmResponse.accountId(),
                customerConfirmResponse.customerId(),
                UUID.randomUUID().toString(),
                customerConfirmResponse.status(),
                "This is a test message");
    }
}
