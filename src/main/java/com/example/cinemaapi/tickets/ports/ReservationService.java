package com.example.cinemaapi.tickets.ports;

import com.example.cinemaapi.tickets.domain.Reservation;
import com.example.cinemaapi.tickets.domain.ReservationRequest;

public interface ReservationService {
    Reservation createReservation(ReservationRequest reservationRequest);
}
