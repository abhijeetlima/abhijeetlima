package com.codewithabhijit.hotel.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
/*import org.springframework.security.crypto.password.PasswordEncoder;*/
import org.springframework.stereotype.Service;

import com.codewithabhijit.hotel.entities.Employees;
import com.codewithabhijit.hotel.exceptions.ResourceNotFoundException;
import com.codewithabhijit.hotel.payloads.EmployeesDto;
import com.codewithabhijit.hotel.repositories.EmployeesRepo;
import com.codewithabhijit.hotel.services.EmployeesService;

@Service
public class EmployeesServiceImpl implements EmployeesService {
	
	@Autowired
	private EmployeesRepo employeesRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	
//	 @Autowired
//	 private PasswordEncoder passwordEncoder;
	 
	
	
//	private ModelMapper modelMapper;

	@Override
	public EmployeesDto createEmployees(EmployeesDto employeesDto) {
		
		Employees employees = this.dtoEmployees(employeesDto);
		
	
        
		Employees savedEmployees = this.employeesRepo.save(employees);
		
//		employees.setPassword(passwordEncoder.encode(employeesDto.getPassword()));

		return this.employeeToDto(savedEmployees);
	}

	@Override
	public EmployeesDto updateEmployees(EmployeesDto employeesDto, Integer employeesId) {
		
		Employees employees =this.employeesRepo.findById(employeesId).
				orElseThrow(() -> new ResourceNotFoundException("Employees","Id",employeesId));
				
		

	    employees.setName(employeesDto.getName());
	    employees.setAge(employeesDto.getAge());
	    employees.setGender(employeesDto.getGender());
	    employees.setJob(employeesDto.getJob());
	    employees.setSalary(employeesDto.getSalary());
	    employees.setPhone(employeesDto.getPhone());
	    employees.setAadharNo(employeesDto.getAadharNo());
	    employees.setEmail(employeesDto.getEmail());
		/*
		 * employees.setPassword(passwordEncoder.encode(employeesDto.getPassword()));
		 */
	    
	    Employees updateEmployees = this.employeesRepo.save(employees);
	    EmployeesDto employeesDto1 = this.employeeToDto(updateEmployees);
	    
		return employeesDto1;
	}

	@Override
	public EmployeesDto getEmployeesById(Integer employeesId) {
	    
		
		
		Employees employees=this.employeesRepo.findById(employeesId)
				.orElseThrow(() -> new ResourceNotFoundException("Employees","Id",employeesId));
		
		return this.employeeToDto(employees);
	}

	@Override
	public List<EmployeesDto> getAllEmployees() {
	    List<Employees> employeesList = this.employeesRepo.findAll();
	    
	    List<EmployeesDto> employeesDtos = employeesList.stream()
	            .map(employee -> this.employeeToDto(employee))
	            .collect(Collectors.toList());

	    return employeesDtos;
	}

	@Override
	public void deleteEmployees(Integer employeesId) {
		// TODO Auto-generated method stub
		Employees employees=this.employeesRepo.findById(employeesId).orElseThrow(()-> new ResourceNotFoundException("Employees","Id",employeesId));
	     this.employeesRepo.delete(employees);

	}
   public Employees dtoEmployees(EmployeesDto employeesDto)
   {

//		Employees employees =this.modelMapper.map(employeesDto,Employees.class);
		
		Employees employees = this.modelMapper.map(employeesDto, Employees.class);
		
		
		
		
//	    employees.setId(employeesDto.getId());
//	    employees.setName(employeesDto.getName());
//	    employees.setAge(employeesDto.getAge());
//	    employees.setGender(employeesDto.getGender());
//	    employees.setJob(employeesDto.getJob());
//	    employees.setSalary(employeesDto.getSalary());
//	    employees.setPhone(employeesDto.getPhone());
//	    employees.setAadharNo(employeesDto.getAadharNo());
//	    employees.setEmail(employeesDto.getEmail());
//	    
	    
	    
	    
	    
//	    user.setName(userDto.getName());
		return employees;
	     
	   
   }
	public EmployeesDto employeeToDto(Employees employees) {
		/*
		 * EmployeesDto employeesDto =
		 * this.modelMapper.map(employees,EmployeesDto.class);
		 */

		EmployeesDto employeesDto = this.modelMapper.map(employees, EmployeesDto.class);
		
//	    employeesDto.setId(employees.getId());
//	    employeesDto.setName(employees.getName());
//	    employeesDto.setAge(employees.getAge());
//	    employeesDto.setGender( employees.getGender());
//	    employeesDto.setJob( employees.getJob());
//	    employeesDto.setSalary (employees.getSalary());
//	    employeesDto.setPhone( employees.getPhone());
//	    employeesDto.setAadharNo( employees.getAadharNo());
//	    employeesDto.setEmail( employees.getEmail());
	    
	    
	    return employeesDto;
	}

//	@Override
//	public Optional<Employees> findByEmail(String email) {
//		// TODO Auto-generated method stub
//		return employeesRepo.findByEmail(email);
//	}
//	
	
//	public String getdatabyemail(int id) {
//		
//		Optional<Employees> emp= employeesRepo.findByEmail(id);
//		System.out.println(emp);
//		
//		return "done" ;
		
		
	}


		
	
	
   

