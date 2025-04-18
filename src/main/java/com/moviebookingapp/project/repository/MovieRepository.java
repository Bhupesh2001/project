package com.moviebookingapp.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviebookingapp.project.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {
}