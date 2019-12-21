package com.example.customerapi.v2.business;

import com.example.domains.dataaccess.repository.CustomerRepository;
import org.springframework.stereotype.Component;

@Component("CustomerManagerV2")
public class CustomerManager {

    private CustomerRepository customerRepository;

    public CustomerManager(CustomerRepository aRepository) {
        this.customerRepository = aRepository;
    }
}
