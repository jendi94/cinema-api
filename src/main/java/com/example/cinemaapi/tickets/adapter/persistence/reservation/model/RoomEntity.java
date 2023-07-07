package com.example.cinemaapi.tickets.adapter.persistence.reservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "Room")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class RoomEntity {
    @Id
    private String id;
    private int roomNumber;
    @OneToMany
    private List<SeatEntity> seats;
}
