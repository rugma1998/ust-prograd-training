package com.example.MovieTicketBooking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Seats {
    @Id
    @GeneratedValue
    private Long id;
    private String seats;
    private Double price;

    @ManyToOne
    private MovieShows movieShows;

    public Seats() {
    }

    public Seats(String seats, Double price) {
        this.seats = seats;
        this.price = price;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

