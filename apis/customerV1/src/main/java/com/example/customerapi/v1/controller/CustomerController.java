package com.example.customerapi.v1.controller;

import com.example.customerapi.v1.business.CustomerManager;
import com.example.customerapi.v1.model.CustomerDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController(value="CustomerControllerV1")
@RequestMapping("/v1/customer")
public class CustomerController {

    private CustomerManager customerManager;

    public CustomerController(@Qualifier("CustomerManagerV1") CustomerManager manager) {
        this.customerManager = manager;
    }

    @GetMapping("/{customer_id}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("customer_id") long customerId) {
        CustomerDTO customerDTO = this.customerManager.getCustomerById(customerId);

        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @GetMapping()
    public ResponseEntity<Set<CustomerDTO>> getCustomers(@RequestParam(name="start", defaultValue="0") int offset,
                                                      @RequestParam(name="size", defaultValue="100") int pageSize) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @PostMapping
    public ResponseEntity<Void> createCustomer(@RequestBody CustomerDTO customer) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @PutMapping
    public ResponseEntity<Void> updateCustomer(@RequestBody CustomerDTO customer) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @DeleteMapping("/{customer_id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable("customer_id") long customerId) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
}
