package com.moviebookingapp.project.service;

import com.moviebookingapp.project.dto.BookTicketRequest;
import com.moviebookingapp.project.entity.Ticket;
import com.moviebookingapp.project.exception.CustomException;
import com.moviebookingapp.project.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Service class for managing tickets.
 */
@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> saveTicket(BookTicketRequest ticketRequest) {
        Ticket ticket = Ticket.builder()
                .bookingDate(ticketRequest.getBookingDate())
                .bookingTime(ticketRequest.getBookingTime())
                .movieName(ticketRequest.getTheatreName())
                .theatreName(ticketRequest.getTheatreName())
                .build();
        List<Ticket> response = new ArrayList<>();
        for (int i = 0; i < ticketRequest.getTicketCount(); i++) {
            response.add(ticketRepository.save(ticket));
        }
        return response;
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