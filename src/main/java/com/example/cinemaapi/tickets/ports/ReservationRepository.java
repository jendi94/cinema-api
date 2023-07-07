package com.example.cinemaapi.tickets.ports;

import com.example.cinemaapi.tickets.domain.Reservation;

public interface ReservationRepository {
    Reservation save(Reservation reservation);
//    Optional<Reservation> getByName(String name);
}
