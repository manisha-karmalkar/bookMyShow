package com.jsp.cloneAPIBookMyShow.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.cloneAPIBookMyShow.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{

}
