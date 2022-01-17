package com.example.Banking.Application.service;

import com.example.Banking.Application.entity.Customer;
import com.example.Banking.Application.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public void createCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public Customer printCustomerDetails(String password){
        return customerRepository.findByPassword(password);
    }

    public void deleteCustomer(Integer accountID) {
        customerRepository.deleteById(accountID);
    }

}