package com.example.cinemaapi.tickets.domain;

import java.util.List;

public record Room(int roomNumber, List<Seat> seats) {

}
