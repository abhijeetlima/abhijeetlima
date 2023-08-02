package com.codewithabhijit.hotel.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.codewithabhijit.hotel.entities.Employees;
import com.codewithabhijit.hotel.payloads.EmployeesDto;

public interface EmployeesRepo extends JpaRepository<Employees,Integer>{
	
	@Query(value = "select roles from  employees where id = ?1", nativeQuery = true)
	Optional<Employees> findByEmail(int id);


}
