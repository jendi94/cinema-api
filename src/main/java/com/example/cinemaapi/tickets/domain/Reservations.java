package com.example.cinemaapi.tickets.domain;

import java.util.UUID;

public class Reservations {

    public UUID createReservation(final ReservationRequest request) {
        //validate reservation request
        //TODO: wyslanie eventu domenowego
        return null;
    }

    public Reservation confirmReservation(int reservationId) {
        return null;
    }

    public Reservation cancelTicket(int reservationId) {
        return null;
    }
}
