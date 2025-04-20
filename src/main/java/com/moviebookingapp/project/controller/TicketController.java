package com.moviebookingapp.project.controller;

import com.moviebookingapp.project.entity.Ticket;
import com.moviebookingapp.project.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for managing tickets.
 */
@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/add")
    public ResponseEntity<Ticket> bookTicket(@RequestBody Ticket ticket) {
        Ticket response = ticketService.saveTicket(ticket);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{movieName}/update/{ticketNumber}")
    public ResponseEntity<Ticket> updateTicketStatus(@PathVariable String movieName, @PathVariable String ticketNumber){
        Ticket response = ticketService.updateTicketStatus(movieName, ticketNumber);
        return ResponseEntity.ok(response);
    }

}