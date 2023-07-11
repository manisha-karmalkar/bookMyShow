package com.jsp.cloneAPIBookMyShow.dto;

import java.time.LocalDateTime;

public class ShowDto {
	private long showId;
	private LocalDateTime showStartTime;
	private LocalDateTime showEndTime;
	private String showLocation;
	//ShowStatus
	private long movieId;
	private String movieName;
	//genre
	private LocalDateTime movieDuration;
	private String movieDescription;
	private String movieLanguage;
	
	private long screenId;
	private String screenName;
	private double classicSeatPrice;
	private double goldSeatPrice;
	private double premiumSeatPrice;
	
	private TheatreDto theatreDto;
	

}
