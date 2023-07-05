package com.example.cinemaapi.tickets.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Reservation {
    MovieTheater movieTheater;
    Movie movie;
    LocalDateTime screeningDate;
    List<Seat> seat;
}
