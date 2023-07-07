package com.example.cinemaapi.tickets.adapter.rest.reservation.model;


import java.util.List;

public record MovieTheaterDto(String name, List<ScreeningDto> screenings) {
}
