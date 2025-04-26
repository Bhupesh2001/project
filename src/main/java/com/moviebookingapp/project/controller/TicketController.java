package com.moviebookingapp.project.controller;

import com.moviebookingapp.project.dto.BookTicketRequest;
import com.moviebookingapp.project.entity.Ticket;
import com.moviebookingapp.project.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing tickets.
 */
@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/add")
    public ResponseEntity<List<Ticket>> bookTicket(@RequestBody BookTicketRequest ticketRequest) {
        List<Ticket> response = ticketService.saveTicket(ticketRequest);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{movieName}/update/{ticketNumber}")
    public ResponseEntity<Ticket> updateTicketStatus(@PathVariable String movieName, @PathVariable String ticketNumber){
        Ticket response = ticketService.updateTicketStatus(movieName, ticketNumber);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/getAllTickets")
    public ResponseEntity<List<Ticket>> getAllTickets(){
        return ResponseEntity.ok(ticketService.getAllTickets());
    }
}