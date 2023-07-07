package com.example.cinemaapi.tickets.adapter.persistence.reservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "Screening")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class ScreeningEntity {
    @Id
    private String id;
    private String screeningId;
    @OneToOne
    private MovieEntity movie;
    private LocalDateTime screeningTime;
    @OneToOne
    private RoomEntity room;
}
