package com.example.cinemaapi.tickets.adapter.persistence.reservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "MovieTheater")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class MovieTheaterEntity {
    @Id
    private String id;
    private String name;
    @OneToMany
    private List<ScreeningEntity> screenings;
}
