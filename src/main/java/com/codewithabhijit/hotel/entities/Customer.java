package com.codewithabhijit.hotel.entities;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    @Column
    private String name;

    @Column
    private String gender;

    @Column
    private String country;

    @Column
    private Integer allocatedRoom;
    
    @Column
    private String Phone;
    
    @Column
    private String document;
    
    @Column
    private String documentNo;
    
    

   
    @Column(name = "check_in")
    private LocalDateTime checkIn;


    @Column
    private double deposit;

}
