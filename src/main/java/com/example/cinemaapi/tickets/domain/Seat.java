package com.example.cinemaapi.tickets.domain;

public record Seat(int seatNumber, int row, boolean isOccupied, boolean isVIP) {
}
