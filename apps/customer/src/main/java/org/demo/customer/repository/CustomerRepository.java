package org.demo.customer.repository;

import org.demo.customer.repository.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {
    public Customer save(Customer customer) {
        return customer;
    }
}
