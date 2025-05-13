package org.demo.booking.services;

import lombok.RequiredArgsConstructor;
import org.demo.booking.repository.AppointmentRepository;
import org.demo.booking.web.booking.data.AppointmentConfirmResponse;
import org.demo.booking.web.booking.data.AppointmentRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final RestTemplate restTemplate;

    public AppointmentConfirmResponse bookAppointment(String accountId, AppointmentRequest appointmentRequest) {
        //create a new customer
        String url = "http://localhost:8081/v1/customer/create/" + accountId;
        Map customerMap = Map.of("name", appointmentRequest.customerName(), "email", appointmentRequest.customerEmail());

        String response = restTemplate.postForObject(url, customerMap, String.class);
        System.out.println(response);

        return appointmentRepository.save();
    }




}
