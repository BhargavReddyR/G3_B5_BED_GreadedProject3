package com.greatlearning.tta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.tta.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{
	
	List<Ticket> findByTitleOrShortDescription(String searchString, String searchString2);
	

}
