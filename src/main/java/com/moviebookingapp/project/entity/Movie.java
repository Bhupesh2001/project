package com.moviebookingapp.project.entity;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "movies")
public class Movie {
    private int maxTickets; // Total number of tickets allotted
    private String movieName;
    private String theatreName;
}
