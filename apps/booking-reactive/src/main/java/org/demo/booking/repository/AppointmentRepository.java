package org.demo.booking.repository;

import org.demo.booking.services.CustomerConfirmResponse;
import org.demo.booking.web.booking.data.AppointmentConfirmResponse;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public class AppointmentRepository {
    public Mono<AppointmentConfirmResponse> save(Mono<CustomerConfirmResponse> customerConfirmResponseMono) {
        return customerConfirmResponseMono.map(customer -> new AppointmentConfirmResponse(
                customer.accountId(),
                customer.customerId(),
                UUID.randomUUID().toString(),
                customer.status(),
                "This is a test message"
        ));
    }
}
