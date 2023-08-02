package com.codewithabhijit.hotel.payloads;

import java.time.LocalDateTime;
import java.util.Date;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomerDto {
	
	
	private Integer customerId;
	
	
	private String name;
	

    private String gender;
	

    private String country;
	

    private Integer allocatedRoom;
    
    private String Phone;
    
    private String document;
    
    private String documentNo;

    private LocalDateTime checkIn;
	

    private double deposit;

}
