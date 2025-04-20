package com.moviebookingapp.project.config;

import com.moviebookingapp.project.entity.Movie;
import com.moviebookingapp.project.repository.MovieRepository;
import com.moviebookingapp.project.repository.TicketRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initMovies(MovieRepository movieRepository, TicketRepository ticketRepository) {
        return (args) -> {
            movieRepository.deleteAll(); // Optional: Clear old data during dev
            ticketRepository.deleteAll();

            Movie m1 = new Movie(100,"Inception", "PVR Cinemas");
            Movie m2 = new Movie(100,"Inception", "INOX");
            Movie m3 = new Movie(100,"Interstellar", "PVR Cinemas");
            Movie m4 = new Movie(100,"Interstellar", "INOX");

            movieRepository.save(m1);
            movieRepository.save(m2);
            movieRepository.save(m3);
            movieRepository.save(m4);

            System.out.println("Sample movies initialized in MongoDB.");
        };
    }
}
