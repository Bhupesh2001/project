package com.moviebookingapp.project.service;

import com.moviebookingapp.project.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviebookingapp.project.entity.Movie;
import com.moviebookingapp.project.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieByName(String movieName) {
        return movieRepository.findById(movieName).orElseThrow(() -> new CustomException("Movie not found"));
    }

    public void deleteMovie(String movieId) {
        movieRepository.deleteById(movieId);
    }
}