package com.example.cinemaapi.tickets.adapter.persistence;

import com.example.cinemaapi.tickets.domain.Reservation;
import com.example.cinemaapi.tickets.ports.ReservationRepository;

public class JpaReservationRepositoryAdapter implements ReservationRepository {
    @Override
    public Reservation save(final Reservation reservation) {
        return null;
    }
}
