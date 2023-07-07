package com.example.cinemaapi.tickets.adapter.persistence.reservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Seat")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class SeatEntity {
    @Id
    String id;
    int seatNumber;
    int row;
    String status;
    String isVIP;
}
