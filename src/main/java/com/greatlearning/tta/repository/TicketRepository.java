package com.greatlearning.tta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.tta.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{

}
