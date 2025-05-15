package org.demo.booking.services;

public record CustomerConfirmResponse(
        String accountId,
        String customerId,
        Boolean status){
}
