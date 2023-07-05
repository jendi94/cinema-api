package com.example.cinemaapi.tickets.adapter.rest;

import com.example.cinemaapi.tickets.domain.ReservationRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RestReservationMapper {
    ReservationRequest toDomain(ReservationRequestDto reservationRequestDto);
    ReservationRequestDto toDto(ReservationRequest reservationRequest);
}
