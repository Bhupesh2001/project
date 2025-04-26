package com.moviebookingapp.project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@Document(collection = "movies")
public class Movie {
    private int maxTickets; // Total number of tickets allotted
    private String movieName;
    private String theatreName;
}
