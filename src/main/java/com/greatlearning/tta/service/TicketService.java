package com.greatlearning.tta.service;

import java.util.List;

import com.greatlearning.tta.entity.Ticket;

public interface TicketService {
		
	List<Ticket> getAllTickets();
	
	Ticket saveTicket(Ticket ticket);
	
	Ticket getTicketById(Long id);
	   
	Ticket editTicket(Ticket ticket);
	
	Ticket viewTicket(Long id);

	void deleteTicketById(Long id);
	
}