package com.example.customerapi.v1.business;

import com.example.domains.dataaccess.dao.Customer;
import com.example.domains.dataaccess.repository.CustomerRepository;
import com.example.customerapi.v1.model.CustomerDTO;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Set;

@Component("CustomerManagerV1")
public class CustomerManager {

    private CustomerRepository customerRepository;

    private CustomerManager(CustomerRepository aRepository) {
        this.customerRepository = aRepository;
    }

    private CustomerDTO convertDAO(Customer customer) {
        CustomerDTO toReturn = new CustomerDTO();
        toReturn.setCity(customer.getAddress().getCity());
        toReturn.setCustomerId(customer.getCustomerId());
        toReturn.setFirstName(customer.getFirstName());
        toReturn.setLastName(customer.getLastName());
        return toReturn;
    }

    public CustomerDTO getCustomerById(long customerId) {
        Optional<Customer> customer =  this.customerRepository.findById(customerId);

        return customer.map(this::convertDAO).orElse(null);
    }

    public Customer createCustomer(CustomerDTO dto) {
        return null;
    }

    public Set<Customer> getCustomers(int offset, int total) {
        return null;
    }

    public void deleteCustomer(long customerId) {

    }

    public void updateCustomer(long customerId, CustomerDTO customer) {

    }

}
