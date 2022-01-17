package com.example.MovieTicketBooking.service;

import com.example.MovieTicketBooking.entity.Seats;
import com.example.MovieTicketBooking.repository.SeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    @Autowired
    private SeatsRepository seatsRepository;

    public Seats getBySeats(String seats){
        return seatsRepository.getBySeats(seats);
    }
}
