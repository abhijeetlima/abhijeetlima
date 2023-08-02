package com.codewithabhijit.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithabhijit.hotel.entities.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer>{

}
