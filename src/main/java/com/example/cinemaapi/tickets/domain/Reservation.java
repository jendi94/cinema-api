package com.example.cinemaapi.tickets.domain;

import lombok.Builder;

import java.util.List;

@Builder
public class Reservation {
    ReservationId reservationId;
    MovieTheater movieTheater;
    Screening screening;
    List<Seat> seat;
}
