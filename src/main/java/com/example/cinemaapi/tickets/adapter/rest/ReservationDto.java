package com.example.cinemaapi.tickets.adapter.rest;

import com.example.cinemaapi.tickets.domain.MovieTheater;
import com.example.cinemaapi.tickets.domain.ReservationId;
import com.example.cinemaapi.tickets.domain.Screening;
import com.example.cinemaapi.tickets.domain.Seat;
import lombok.Data;

import java.util.List;

@Data
public class ReservationDto {
    ReservationId reservationId;
    MovieTheater movieTheater;
    Screening screening;
    List<Seat> seat;
}
