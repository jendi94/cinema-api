package com.example.cinemaapi.tickets.domain;

import com.example.cinemaapi.tickets.ports.ReservationService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Reservations implements ReservationService {

    MovieTheaterRepository movieTheaterRepository;

    @Override
    public Reservation createReservation(final ReservationRequest request) {
        //validate reservation request
        //TODO: wyslanie eventu domenowego
        MovieTheater movieTheater = movieTheaterRepository.getByName(request.movieTheater().name());
        var screenings = movieTheater.screenings();
        var screening = screenings.stream()
            .filter(candidateScreening -> candidateScreening.screeningTime().equals(request.screeningTime()))
            .filter(candidateScreening -> candidateScreening.movie().equals(request.movie()))
            .findFirst()
            .orElseThrow(MovieNotFoundException::new);

        List<Seat> selectedSeats = new ArrayList<>();

        request.seats().forEach(seatRequest -> screening.room().seats().stream()
            .filter(seat -> seat.row() == seatRequest.row())
            .filter(seat -> seat.seatNumber() == seatRequest.seatNumber())
            .filter(seat -> SeatStatus.UNOCCUPIED.equals(seat.status()))
            .forEach(selectedSeats::add));

        if (selectedSeats.size() == request.seats().size()) {


            return Reservation.builder()
                .reservationId(new ReservationId(UUID.randomUUID()))
                .movieTheater(movieTheater)
                .screening(screening)
                .seat(selectedSeats)
                .build();
        } else {
            throw new SeatsOccupiedException();
        }
    }

    public Reservation confirmReservation(int reservationId) {
        return null;
    }

    public Reservation cancelTicket(int reservationId) {
        return null;
    }
}
