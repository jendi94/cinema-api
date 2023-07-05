package com.example.cinemaapi.tickets.domain;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;

@Builder
public class Reservation {
    ReservationId reservationId;
    MovieTheater movieTheater;
    Screening screening;
    List<Seat> seat;
}
