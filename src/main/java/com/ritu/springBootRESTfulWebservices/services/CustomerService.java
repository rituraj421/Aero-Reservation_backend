package com.ritu.springBootRESTfulWebservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ritu.springBootRESTfulWebservices.models.Customer;
import com.ritu.springBootRESTfulWebservices.repos.CustomerRepository;
import com.ritu.springBootRESTfulWebservices.utils.Util;

import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Set<Customer> getCustomers() {
        Set<Customer> customers = new LinkedHashSet<>();
        Iterable<Customer> customerIterable = customerRepository.findAll();
        if (customerIterable != null) {
            customerIterable.forEach(customers::add);
        }
        return customers;
    }

    public Customer getCustomerById(Integer customerId) {
        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        return optionalCustomer.isPresent() ? optionalCustomer.get() : null;
    }

    public Customer getCustomerByEmail(String email) {
        if (Util.validateEmail(email))
            return customerRepository.findByEmailIgnoreCase(email);
        return null;
    }

    public boolean deleteCustomerById(Integer customerId) throws IllegalArgumentException, NoSuchElementException {
        if (Util.validateNumber(customerId)) {
            Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
            if (!optionalCustomer.isPresent())
                throw new NoSuchElementException("Customer does not exists with id=" + customerId);
            customerRepository.deleteCustomerByCustomerId(customerId);
            return true;
        }
        return false;
    }
}
