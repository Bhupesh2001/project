package com.moviebookingapp.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviebookingapp.project.entity.Movie;
import com.moviebookingapp.project.repository.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(String movieId) {
        return movieRepository.findById(movieId);
    }

    public Movie updateMovie(String movieId, Movie movieDetails) {
        Movie movie = movieRepository.findById(movieId).orElseThrow(() -> new RuntimeException("Movie not found"));
        movie.setNumberOfTickets(movieDetails.getNumberOfTickets());
        movie.setSeatNumber(movieDetails.getSeatNumber());
        movie.setMovieName(movieDetails.getMovieName());
        movie.setTheatreName(movieDetails.getTheatreName());
        return movieRepository.save(movie);
    }

    public void deleteMovie(String movieId) {
        movieRepository.deleteById(movieId);
    }
}