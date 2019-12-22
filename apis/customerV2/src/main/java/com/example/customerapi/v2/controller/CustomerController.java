package com.example.customerapi.v2.controller;

import com.example.customerapi.v2.business.CustomerManager;
import com.example.customerapi.v2.model.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController(value="CustomerControllerV2")
@RequestMapping("/v2/customer")
public class CustomerController {

    private CustomerManager customerManager;

    public CustomerController(CustomerManager aManager) {
        this.customerManager = aManager;
    }

    @GetMapping("/{customer_id}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("customer_id") long customerId) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @PostMapping
    public ResponseEntity<Void> createCustomer(@RequestBody CustomerDTO dto) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @PatchMapping("/{customer_id}")
    public ResponseEntity<CustomerDTO> updateCustomer(@PathVariable("customer_id") String customerId, @RequestBody CustomerDTO toUpdate) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
}
