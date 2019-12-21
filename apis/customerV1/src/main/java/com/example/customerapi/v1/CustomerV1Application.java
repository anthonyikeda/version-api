package com.example.customerapi.v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example.domains.dataaccess"})
@SpringBootApplication
public class CustomerV1Application {

    public static void main(String[] args) {
        SpringApplication.run(CustomerV1Application.class, args);
    }
}
