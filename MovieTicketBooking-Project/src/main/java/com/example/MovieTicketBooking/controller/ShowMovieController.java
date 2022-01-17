package com.example.MovieTicketBooking.controller;

import com.example.MovieTicketBooking.entity.Movie;
import com.example.MovieTicketBooking.service.MovieService;
import com.example.MovieTicketBooking.service.MovieShowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ShowMovieController {
    @Autowired
    private MovieShowsService movieShowsService;
    @Autowired
    private MovieService movieService;


    @GetMapping("/movie/{movieId}")
    public String movieShows(@PathVariable Long movieId, Model model){
        model.addAttribute("shows", movieShowsService.showsDetails(movieId));
        Movie movie = movieService.getByMovieId(movieId);
        model.addAttribute("movieName", movie.getMovieName());
        return "movieShows";
    }


}
