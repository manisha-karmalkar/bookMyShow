package com.jsp.cloneAPIBookMyShow.dto;

import java.util.List;

public class TheatreDto {
	private long theatreId;
	private String theatreName;

	private AddressDto addressDto;
	private List<ScreenDto> screenDto;
	private OwnerDto ownerDto;
	private List<ShowDto> showsDto;

}
