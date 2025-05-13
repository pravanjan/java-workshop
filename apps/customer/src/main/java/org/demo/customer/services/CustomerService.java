package org.demo.customer.services;

import lombok.RequiredArgsConstructor;
import org.demo.customer.repository.CustomerRepository;
import org.demo.customer.repository.model.Customer;
import org.demo.customer.web.customer.data.CustomerConfirmResponse;
import org.demo.customer.web.customer.data.CustomerRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerConfirmResponse saveCustomer(String accountId, CustomerRequest customerRequest) {
       Customer customer =  customerRepository.save(new Customer( UUID.randomUUID().toString(),accountId
               , customerRequest.name(), customerRequest.email()));
        try {
            Thread.sleep(60_000); // 60,000 milliseconds = 1 minute
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Best practice
            return null;
        }
       return new CustomerConfirmResponse(customer.getAccountId(), customer.getCustomerId(),true);
    }




}
