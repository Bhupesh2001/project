package com.moviebookingapp.project.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "movies")
public class Movie {
    @Id
    private String movieId; // Unique identifier for the movie
    private int numberOfTickets; // Number of tickets booked
    private String seatNumber; // Seat number(s)

    // Marking movieName and theatreName as foreign keys using ORM annotations
    @Reference
    private String movieName;

    @Reference
    private String theatreName;
}
