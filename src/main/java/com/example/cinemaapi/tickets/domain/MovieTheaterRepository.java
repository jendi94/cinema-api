package com.example.cinemaapi.tickets.domain;

public interface MovieTheaterRepository {
    MovieTheater getByName(String name);
}
