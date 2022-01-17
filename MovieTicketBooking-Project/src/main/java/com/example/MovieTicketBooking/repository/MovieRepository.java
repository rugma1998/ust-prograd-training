package com.example.MovieTicketBooking.repository;

import com.example.MovieTicketBooking.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}