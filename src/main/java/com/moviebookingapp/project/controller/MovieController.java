package com.moviebookingapp.project.controller;

import com.moviebookingapp.project.entity.Movie;
import com.moviebookingapp.project.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/add")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        Movie createdMovie = movieService.createMovie(movie);
        return ResponseEntity.ok(createdMovie);
    }

    @GetMapping("/movie/search/{movieName}")
    public ResponseEntity<Movie> getMovieById(@PathVariable String movieName) {
        Movie movie = movieService.getMovieByName(movieName);
        return ResponseEntity.ok(movie);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieService.getAllMovies();
        return ResponseEntity.ok(movies);
    }

    @DeleteMapping("/{movieName}/delete/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable String movieName,@PathVariable String id) {
        movieService.deleteMovie(id);
        return ResponseEntity.noContent().build();
    }
}