package com.jsp.cloneAPIBookMyShow.dto;

import java.time.LocalDate;
import java.util.List;

public class ProductionHouseDto {

	private long productionId;
	private String productionName;
	private LocalDate establishment;

	private OwnerDto owner;
	private List<MovieDto> movies;

}
