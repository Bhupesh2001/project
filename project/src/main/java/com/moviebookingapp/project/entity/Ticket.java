package com.moviebookingapp.project.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "tickets")
public class Ticket {
    @Id
    private String ticketId; // Unique identifier for the ticket
    private String userId; // ID of the user who booked the ticket
    private String movieId; // ID of the movie for which the ticket is booked
    private String seatNumber; // Seat number for the ticket
}