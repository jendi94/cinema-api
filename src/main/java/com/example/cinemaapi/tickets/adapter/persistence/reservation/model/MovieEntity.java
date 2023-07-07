package com.example.cinemaapi.tickets.adapter.persistence.reservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Movie")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class MovieEntity {

    @Id
    private String id;
    private String name;
}
