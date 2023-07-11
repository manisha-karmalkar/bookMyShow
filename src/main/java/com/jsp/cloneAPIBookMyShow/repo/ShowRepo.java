package com.jsp.cloneAPIBookMyShow.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.cloneAPIBookMyShow.entity.Show;

public interface ShowRepo extends JpaRepository<Show, Long
> {

}
