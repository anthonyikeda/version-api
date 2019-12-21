package com.example.customerapi.v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.domains.dataaccess"})
public class CustomerV2Application {
    public static void main(String[] args) {
        SpringApplication.run(CustomerV2Application.class, args);
    }

}
