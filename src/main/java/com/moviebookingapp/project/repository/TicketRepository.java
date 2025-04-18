package com.moviebookingapp.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.moviebookingapp.project.entity.Ticket;

@Repository
public interface TicketRepository extends MongoRepository<Ticket, String> {
}
