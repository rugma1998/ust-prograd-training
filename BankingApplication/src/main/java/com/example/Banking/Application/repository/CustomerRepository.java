package com.example.Banking.Application.repository;

import com.example.Banking.Application.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository  extends JpaRepository<Customer,Integer> {

    Customer findByPassword(String password);
}