package org.demo.booking;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(
        servers = {
                @Server(url = "http://localhost:8082", description = "Booking service ")
        }
)
@SpringBootApplication(scanBasePackages = "org.demo")
public class ReactiveBookingApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReactiveBookingApplication.class, args);
    }
}