package com.example.customerapi.v2.controller;

import com.example.customerapi.v2.business.CustomerManager;
import com.example.customerapi.v2.model.CustomerDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2/customer")
public class CustomerController {

    private Logger log = LoggerFactory.getLogger(CustomerController.class);

    private CustomerManager customerManager;

    public CustomerController(CustomerManager aManager) {
        this.customerManager = aManager;
    }

    @GetMapping("/{customer_id}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("customer_id") Long customerId) {
        log.debug("Getting customer with id {}", customerId);

        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @PostMapping
    public ResponseEntity<Void> createCustomer(@RequestBody CustomerDTO dto) {
        log.debug("Creating new customer with city {}", dto.getAddress().getCity());

        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @PatchMapping("/{customer_id}")
    public ResponseEntity<CustomerDTO> updateCustomer(@PathVariable("customer_id") Long customerId, @RequestBody CustomerDTO toUpdate) {
        log.debug("Updating customer {}", customerId);

        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @DeleteMapping("/{customer_id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable("customer_id") Long customerId) {
        log.debug("Deleting customer {}", customerId);

        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
}
