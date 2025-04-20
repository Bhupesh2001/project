package com.moviebookingapp.project.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookTicketRequest {
    private String bookingDate;
    private String bookingTime;
    private String theatreName;
    private String movieName;
    private Integer ticketCount;
}
