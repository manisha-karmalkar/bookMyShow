package com.jsp.cloneAPIBookMyShow.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.cloneAPIBookMyShow.entity.Booking;

public interface BookingRepo extends JpaRepository <Booking,Long>{

}
