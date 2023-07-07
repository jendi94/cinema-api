package com.example.cinemaapi.tickets.adapter.rest.reservation.model;

import com.example.cinemaapi.tickets.domain.Movie;
import com.example.cinemaapi.tickets.domain.Room;
import com.example.cinemaapi.tickets.domain.ScreeningId;

import java.time.LocalDateTime;

public record ScreeningDto(ScreeningId screeningId, Movie movie, LocalDateTime screeningTime, Room room) {
}
