package com.jsp.cloneAPIBookMyShow.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.cloneAPIBookMyShow.entity.Movie;

public interface MovieRepo extends JpaRepository<Movie, Long>{

}
