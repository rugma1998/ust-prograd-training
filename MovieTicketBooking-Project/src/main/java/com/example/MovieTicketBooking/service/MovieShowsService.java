package com.example.MovieTicketBooking.service;

import com.example.MovieTicketBooking.entity.MovieShows;
import com.example.MovieTicketBooking.repository.MovieShowsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieShowsService {
    @Autowired
    private MovieShowsRepository movieShowsRepository;

    public List<MovieShows> showsDetails(Long movieId){
        return movieShowsRepository.findByMovieMovieId(movieId);
    }

    public List<MovieShows> showsList(){
        return movieShowsRepository.findAll();
    }
    public MovieShows getById(Long id){
        return movieShowsRepository.getById(id);
    }
    public  Boolean existsById(Long id){
        return movieShowsRepository.existsById(id);
    }
}





