package com.example.cinemaapi.tickets.adapter.persistence;

import com.example.cinemaapi.tickets.adapter.persistence.reservation.model.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaReservationRepository extends JpaRepository<ReservationEntity, String> {

}
