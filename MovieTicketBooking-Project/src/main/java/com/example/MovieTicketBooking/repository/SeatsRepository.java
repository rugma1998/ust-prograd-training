package com.example.MovieTicketBooking.repository;

import com.example.MovieTicketBooking.entity.Seats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatsRepository extends JpaRepository<Seats, Long> {
    public Seats getBySeats(String seats);
}
