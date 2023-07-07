package com.example.cinemaapi.tickets.adapter.rest.reservation.model;

import com.example.cinemaapi.tickets.domain.Movie;
import com.example.cinemaapi.tickets.domain.MovieTheater;
import com.example.cinemaapi.tickets.domain.SeatRequest;

import java.time.LocalDateTime;
import java.util.List;

public class ReservationRequestDto {
    MovieTheater movieTheater;
    LocalDateTime screeningTime;
    Movie movie;
    List<SeatRequest> seats;
}
