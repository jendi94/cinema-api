package com.example.cinemaapi.tickets.domain;

import java.util.UUID;

public class Reservations {

    MovieTheaterRepository movieTheaterRepository;

    public UUID createReservation(final ReservationRequest request) {
        //validate reservation request
        //TODO: wyslanie eventu domenowego
        MovieTheater movieTheater = movieTheaterRepository.getByName(request.movieTheater().name());
        var screenings = movieTheater.screenings();
        var screening = screenings.stream()
            .filter(candidateScreening -> candidateScreening.screeningTime().equals(request.screeningTime()))
            .filter(candidateScreening -> candidateScreening.movie().equals(request.movie()))
            .findFirst()
            .orElseThrow(MovieNotFoundException::new);

        var seats = screening.room().seats();
//        seats.stream()
//            .filter()

        return null;
    }

//    private BiPredicate<Seat, Seat> areSeatsAvailable() {
//
//    }

    public Reservation confirmReservation(int reservationId) {
        return null;
    }

    public Reservation cancelTicket(int reservationId) {
        return null;
    }
}
