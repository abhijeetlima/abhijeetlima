package com.codewithabhijit.hotel.payloads;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class RoomDto {
	
	
	private Integer roomId;
	
	
	@NotNull(message="enter room number !!")
	private Integer roomNumber;
	
	
	@NotEmpty(message = "enter Availability !!")
	private String availability;
	
	
	
	@NotEmpty(message = "Enter cleaning status")
	private String cleaningStatus;
	
	@NotNull(message = "Enter price")
	private double price;
	
	@NotEmpty
	private String bedType;
}
