package com.example.cinemaapi.tickets.adapter.persistence;

import com.example.cinemaapi.tickets.adapter.persistence.reservation.model.ReservationEntity;
import com.example.cinemaapi.tickets.domain.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface JpaReservationPersistenceMapper {

    @Mapping(source = "reservationId.uuid", target = "reservationId")
    @Mapping(source = "screeningId.uuid", target = "screening.screeningId")
    ReservationEntity toEntity(Reservation reservation);

    @Mapping(source = "reservationId", target = "reservationId.uuid")
    @Mapping(source = "screening.screeningId", target = "screeningId.uuid")
    Reservation toDomain(ReservationEntity reservationEntity);
}
