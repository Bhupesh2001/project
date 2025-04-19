package com.moviebookingapp.project.controller;

import com.moviebookingapp.project.entity.Ticket;
import com.moviebookingapp.project.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing tickets.
 */
@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    /**
     * Endpoint to save a new ticket.
     * 
     * @param ticket The ticket to save.
     * @return The saved ticket.
     */
    @PostMapping
    public ResponseEntity<Ticket> saveTicket(@RequestBody Ticket ticket) {
        Ticket savedTicket = ticketService.saveTicket(ticket);
        return ResponseEntity.ok(savedTicket);
    }

    /**
     * Endpoint to retrieve all tickets.
     * 
     * @return A list of all tickets.
     */
    @GetMapping
    public ResponseEntity<List<Ticket>> getAllTickets() {
        List<Ticket> tickets = ticketService.getAllTickets();
        return ResponseEntity.ok(tickets);
    }

    /**
     * Endpoint to retrieve a ticket by its ticket number.
     * 
     * @param ticketNumber The ticket number.
     * @return The ticket if found, or a 404 response if not.
     */
    @GetMapping("/{ticketNumber}")
    public ResponseEntity<Ticket> getTicketByNumber(@PathVariable String ticketNumber) {
        Optional<Ticket> ticket = ticketService.getTicketByNumber(ticketNumber);
        return ticket.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * Endpoint to delete a ticket by its ticket number.
     * 
     * @param ticketNumber The ticket number.
     * @return A response indicating the result of the operation.
     */
    @DeleteMapping("/{ticketNumber}")
    public ResponseEntity<Void> deleteTicket(@PathVariable String ticketNumber) {
        ticketService.deleteTicket(ticketNumber);
        return ResponseEntity.noContent().build();
    }
}