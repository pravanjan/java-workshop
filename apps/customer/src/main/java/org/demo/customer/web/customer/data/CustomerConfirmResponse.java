package org.demo.customer.web.customer.data;

public record CustomerConfirmResponse(
        String accountId,
        String customerId,
        Boolean status){
}
