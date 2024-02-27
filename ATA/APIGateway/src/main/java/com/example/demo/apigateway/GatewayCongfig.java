package com.example.demo.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayCongfig {
	
	@Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("Registration-Microservice", r -> r
                        .path("/api/registration/**")
                        .uri("http://localhost:8081")) // Assuming registration-service is the service ID of your registration microservice
                .route("Vehicle-Microservice", r -> r
                        .path("/api/vehicle/**")
                        .uri("http://localhost:8082"))
                .route("Booking-Microservices", r -> r
                        .path("/api/booking/**")
                        .uri("http://localhost:8083"))
                .route("Driver-Microservices", r -> r
                        .path("/api/driver/**")
                        .uri("http://localhost:8084"))
                .route("Route-Microservices", r -> r
                        .path("/api/route/**")
                        .uri("http://localhost:8085"))
                .build();
    }

}
