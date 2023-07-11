package com.jsp.cloneAPIBookMyShow.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.cloneAPIBookMyShow.entity.Ticket;

public interface TicketRepo extends  JpaRepository<Ticket , Long>{

}
