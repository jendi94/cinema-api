package com.example.cinemaapi.tickets.domain;

import java.time.LocalDateTime;

public record Screening(Movie movie, LocalDateTime screeningTime, Room room) {
}
