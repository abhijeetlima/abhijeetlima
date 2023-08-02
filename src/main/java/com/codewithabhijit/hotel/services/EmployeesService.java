package com.codewithabhijit.hotel.services;

import java.util.List;
import java.util.Optional;

import com.codewithabhijit.hotel.entities.Employees;
import com.codewithabhijit.hotel.payloads.EmployeesDto;

public interface EmployeesService {
	
	
	 EmployeesDto  createEmployees(EmployeesDto employees);
	 EmployeesDto  updateEmployees(EmployeesDto  employees ,Integer employeesId);
	 EmployeesDto  getEmployeesById(Integer employeesId);
	 List<EmployeesDto> getAllEmployees();
	 void deleteEmployees(Integer  employeesId);
//	 Optional<Employees> findByEmail(String email);
//	 String getdatabyemail(int id);

	 
	
	 

}
