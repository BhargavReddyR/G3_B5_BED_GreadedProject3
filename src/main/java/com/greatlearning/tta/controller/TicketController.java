package com.greatlearning.tta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.greatlearning.tta.service.TicketService;
import com.greatlearning.tta.entity.Ticket;


@Controller
public class TicketController {

 
    private TicketService ticketService;


    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
   
    @GetMapping("/tickets")
    public String listtickets(Model model) {
        model.addAttribute("tickets", ticketService.getAllTickets());
        return "tickets";
    }  
    
   @GetMapping("/tickets/newtickets")
   public String createTicketForm(Model model) {
	   
       // create Ticket object to hold Ticket form data
	   
       Ticket ticket = new Ticket();
       model.addAttribute("ticket", ticket);
       return "create_ticket";
   }


   @PostMapping("/tickets")
   public String saveTicket(
		   
           @ModelAttribute("ticket") Ticket ticket) {
	   ticketService.saveTicket(ticket);
       return "redirect:/tickets";
   }  
   
   @GetMapping("/tickets/{id}/edit")
	public String editTicketForm(
			@PathVariable Long id, Model model) {
		model.addAttribute("ticket", ticketService.getTicketById(id));
		return "edit_ticket";
	}
   @PostMapping("/tickets/{id}")
	public String editTicket(
			@PathVariable Long id, @ModelAttribute("ticket") Ticket ticket, 
			Model model) {

		// get ticket from database by id
	   Ticket existingTicket = ticketService.getTicketById(id);
		existingTicket.setId(id);
		existingTicket.setTitle(ticket.getTitle());
		existingTicket.setShortDiscription(ticket.getShortDiscription());
		existingTicket.setCreatedOn(ticket.getCreatedOn());

		// save edit ticket object
		ticketService.editTicket(existingTicket);
		return "redirect:/tickets";
	}	
   
   @GetMapping("/tickets/{id}/view")
	public String viewTicketForm(
			@PathVariable Long id, Model model) {
		model.addAttribute("ticket", ticketService.getTicketById(id));
		return "view_ticket";
	}

   @PostMapping("/tickets/{id}/")
	public String viewTicket(
			@PathVariable Long id, @ModelAttribute("ticket") Ticket ticket, 
			Model model) {

		// get ticket from database by id
	   Ticket existingTicket = ticketService.getTicketById(id);
		existingTicket.setId(id);
		existingTicket.setTitle(ticket.getTitle());
		existingTicket.setShortDiscription(ticket.getShortDiscription());
		existingTicket.setCreatedOn(ticket.getCreatedOn());
		return "redirect:/tickets";
	}	

   
   @GetMapping("/tickets/{id}")
   public String deleteTickets(
		   @PathVariable Long id) {
       ticketService.deleteTicketById(id);
       return "redirect:/tickets";
	}
 
}