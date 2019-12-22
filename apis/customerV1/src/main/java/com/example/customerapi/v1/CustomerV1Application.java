package com.example.customerapi.v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.example.domains.dataaccess.dao")
@EnableJpaRepositories(basePackages = {"com.example.domains.dataaccess.repository"})
@SpringBootApplication
public class CustomerV1Application {

    public static void main(String[] args) {
        SpringApplication.run(CustomerV1Application.class, args);
    }
}
