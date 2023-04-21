package com.greatlearning.tta.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.greatlearning.tta.entity.Ticket;
import com.greatlearning.tta.repository.TicketRepository;
import com.greatlearning.tta.service.TicketService;


@Service
public class TicketServiceImpl implements TicketService{

	@Autowired
    private TicketRepository ticketRepository;
   
    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
     
    @Override
    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
 
    @Override
    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id).get();
    }


    @Override
    public Ticket editTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
       
    }
    @Override
    public Ticket viewTicket(Long id) {
        return ticketRepository.findById(id).get();
    }
    
    public void deleteTicketById(Long id) {
        ticketRepository.deleteById(id);
    }

	@Override
	public List<Ticket> getTicketsbyTitleAndShortDesc(String searchString) {
		
		 return ticketRepository.findByTitleOrShortDiscription(searchString,searchString);
	}
    

   
}