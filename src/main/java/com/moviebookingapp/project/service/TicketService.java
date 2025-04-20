package com.moviebookingapp.project.service;

import com.moviebookingapp.project.entity.Ticket;
import com.moviebookingapp.project.exception.CustomException;
import com.moviebookingapp.project.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service class for managing tickets.
 */
@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Ticket updateTicketStatus(String movieName,String ticketNumber){
        Optional<Ticket> ticketOptional = ticketRepository.findById(ticketNumber);
        if(ticketOptional.isEmpty()){
            throw new CustomException("Invalid Ticket Number");
        }
//        TODO
        //        ticket.setMovieName();
        return ticketOptional.get();
    }
}