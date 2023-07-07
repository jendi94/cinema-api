package com.example.cinemaapi.tickets.adapter.persistence.reservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "Reservation")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class ReservationEntity {
    @Id
    private String id;
    private String reservationId;
    @OneToOne
    private MovieTheaterEntity movieTheater;
    @OneToOne
    private ScreeningEntity screening;
    @OneToMany
    private List<SeatEntity> seat;
}
