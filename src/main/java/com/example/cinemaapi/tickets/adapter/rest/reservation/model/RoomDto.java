package com.example.cinemaapi.tickets.adapter.rest.reservation.model;

import com.example.cinemaapi.tickets.domain.Seat;

import java.util.List;

public record RoomDto(int roomNumber, List<SeatDto> seats) {
}
