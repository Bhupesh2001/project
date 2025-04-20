package com.moviebookingapp.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.moviebookingapp.project.entity.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {
    public Movie findByMovieName(String movieName);
}