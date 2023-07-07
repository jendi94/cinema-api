package com.example.cinemaapi.tickets.adapter.persistence;

import com.example.cinemaapi.tickets.domain.Reservation;
import com.example.cinemaapi.tickets.ports.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@RequiredArgsConstructor
@Component
public class JpaReservationRepositoryAdapter implements ReservationRepository {

    private final JpaReservationPersistenceMapper mapper;
    private final JpaReservationRepository repository;


    @Override
    public Reservation save(final Reservation reservation) {
        var reservationEntity = mapper.toEntity(reservation);
        return mapper.toDomain(repository.save(reservationEntity));
    }
}
