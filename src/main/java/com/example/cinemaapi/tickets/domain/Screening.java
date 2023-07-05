package com.example.cinemaapi.tickets.domain;

import java.time.LocalDateTime;

public record Screening(ScreeningId screeningId, Movie movie, LocalDateTime screeningTime, Room room) {
}
