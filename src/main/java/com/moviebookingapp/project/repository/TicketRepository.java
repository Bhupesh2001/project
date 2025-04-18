package com.moviebookingapp.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviebookingapp.project.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, String> {
}
