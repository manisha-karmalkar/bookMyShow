package com.jsp.cloneAPIBookMyShow.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.cloneAPIBookMyShow.entity.Owner;

public interface ownerRepo extends JpaRepository<Owner, Long> {

}
