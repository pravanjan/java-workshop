package org.demo.customer.web.customer;

import lombok.RequiredArgsConstructor;
import org.demo.customer.services.CustomerService;
import org.demo.customer.web.customer.data.CustomerConfirmResponse;
import org.demo.customer.web.customer.data.CustomerRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/create/{accountId}")
    public CustomerConfirmResponse bookAppointment(@PathVariable final String accountId, @RequestBody CustomerRequest customerRequest) {

        return customerService.saveCustomer(accountId,customerRequest);
    }


}
