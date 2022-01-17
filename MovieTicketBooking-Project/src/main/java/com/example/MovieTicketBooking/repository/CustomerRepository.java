package com.example.MovieTicketBooking.repository;

import com.example.MovieTicketBooking.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
