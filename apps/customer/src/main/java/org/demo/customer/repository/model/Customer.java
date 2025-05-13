package org.demo.customer.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Customer {
    String customerId;
    String accountId;
    String name;
    String email;
}
