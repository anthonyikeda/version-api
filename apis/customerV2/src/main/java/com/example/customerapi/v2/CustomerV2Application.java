package com.example.customerapi.v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.domains.dataaccess.dao")
@EnableJpaRepositories(basePackages = {"com.example.domains.dataaccess.repository"})
public class CustomerV2Application {
    public static void main(String[] args) {
        SpringApplication.run(CustomerV2Application.class, args);
    }

}
