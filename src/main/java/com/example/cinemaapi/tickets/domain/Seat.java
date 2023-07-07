package com.example.cinemaapi.tickets.domain;

public record Seat(int seatNumber, int row, SeatStatus status, SeatType isVIP) {
}

