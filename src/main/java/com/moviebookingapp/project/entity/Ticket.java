package com.moviebookingapp.project.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Data;

/**
 * Represents a ticket in the movie booking system.
 * This class is used to store information about a ticket, including its ID, number of tickets booked,
 * seat number(s), and references to the associated movie and theatre names.
 */
@Data
@Builder
@Document(collection = "tickets")
public class Ticket {
    @Id
    private String ticketNumber;
    private String bookingDate;
    private String bookingTime;
    private String theatreName;
    private String movieName;
}
