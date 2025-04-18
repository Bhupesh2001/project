package com.moviebookingapp.project.service;

import com.moviebookingapp.project.entity.Ticket;
import com.moviebookingapp.project.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing tickets.
 */
@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    /**
     * Save a new ticket.
     * 
     * @param ticket The ticket to save.
     * @return The saved ticket.
     */
    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    /**
     * Retrieve all tickets.
     * 
     * @return A list of all tickets.
     */
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    /**
     * Retrieve a ticket by its ticket number.
     * 
     * @param ticketNumber The ticket number.
     * @return An Optional containing the ticket if found, or empty if not.
     */
    public Optional<Ticket> getTicketByNumber(String ticketNumber) {
        return ticketRepository.findById(ticketNumber);
    }

    /**
     * Delete a ticket by its ticket number.
     * 
     * @param ticketNumber The ticket number.
     */
    public void deleteTicket(String ticketNumber) {
        ticketRepository.deleteById(ticketNumber);
    }
}