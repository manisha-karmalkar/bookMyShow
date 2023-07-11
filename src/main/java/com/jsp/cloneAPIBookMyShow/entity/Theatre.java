package com.jsp.cloneAPIBookMyShow.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Theatre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long theatreId;
	private String theatreName;
	@OneToMany
	private Address address;
	
	@OneToMany
	private List<Screen> screen;
	
	@ManyToOne
	private Owner owner;
	
	@OneToMany
	private List<Show> shows;

}
