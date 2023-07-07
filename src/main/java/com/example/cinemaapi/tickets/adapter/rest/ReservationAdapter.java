package com.example.cinemaapi.tickets.adapter.rest;

import com.example.cinemaapi.tickets.adapter.rest.reservation.model.ReservationDto;
import com.example.cinemaapi.tickets.adapter.rest.reservation.model.ReservationRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("reservations")
@RestController
@RequiredArgsConstructor
public class ReservationAdapter {

    RestReservationMapper mapper;


    @PostMapping("")
    public ResponseEntity<ReservationDto> reserve(@RequestBody ReservationRequestDto reservationRequest) {
        var reservationDomain = mapper.toDomain(reservationRequest);
        return null;
    }
}
