package com.example.cinemaapi.tickets.adapter.rest.reservation.model;

import com.example.cinemaapi.tickets.domain.SeatStatus;
import com.example.cinemaapi.tickets.domain.SeatType;

public record SeatDto(int seatNumber, int row, SeatStatus status, SeatType isVIP) {

}