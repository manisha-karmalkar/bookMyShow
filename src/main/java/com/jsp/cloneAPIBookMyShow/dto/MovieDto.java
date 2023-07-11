package com.jsp.cloneAPIBookMyShow.dto;

import java.time.LocalDateTime;

public class MovieDto {

	private long movieId;
	private String movieName;
	
	private LocalDateTime movieDuration;
	private String movieDescription;
	private String language;
	private ProductionHouseDto productionHouseDto;
}
