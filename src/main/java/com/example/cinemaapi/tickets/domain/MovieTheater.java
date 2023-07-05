package com.example.cinemaapi.tickets.domain;

import java.util.List;

public record MovieTheater(String name, List<Screening> screenings) {
}
