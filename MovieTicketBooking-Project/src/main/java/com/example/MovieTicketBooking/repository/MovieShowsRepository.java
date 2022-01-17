package com.example.MovieTicketBooking.repository;


//import com.example.MovieTicketBooking.entity.MovieShow;
import com.example.MovieTicketBooking.entity.MovieShows;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieShowsRepository extends JpaRepository<MovieShows, Long> {
    public List<MovieShows> findByMovieMovieId(Long MovieId);
}








