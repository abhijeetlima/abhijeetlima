package com.codewithabhijit.hotel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roomId;
	
	@Column
	private Integer roomNumber;
	
	
	@Column
	private String availability;
	
	
	@Column
    private String cleaningStatus;
    
	@Column
    private double price;
    
	@Column
    private String bedType;
	}
