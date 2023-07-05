package com.example.cinemaapi.tickets.domain;

import java.time.LocalDateTime;
import java.util.List;

public record ReservationRequest(MovieTheater movieTheater,
                                 LocalDateTime screeningTime,
                                 Movie movie,
                                 List<Seat> seats) {

}
