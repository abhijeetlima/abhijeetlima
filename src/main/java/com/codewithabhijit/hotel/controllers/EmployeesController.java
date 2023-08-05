package com.codewithabhijit.hotel.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithabhijit.hotel.payloads.EmployeesDto;
import com.codewithabhijit.hotel.payloads.ApiResponse;
import com.codewithabhijit.hotel.repositories.EmployeesRepo;
import com.codewithabhijit.hotel.services.EmployeesService;

import lombok.ToString;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:3000") 
@ToString
public class EmployeesController {
	
	    @Autowired
		private EmployeesService employeeService;
	    
	    @Autowired
		private EmployeesRepo employeesRepo;
	    
	    
	
	//POST-CREATE
	    
	 
		@PostMapping("/")
//		@PreAuthorize("hasAuthority('ADMIN')")
	  public ResponseEntity<EmployeesDto> createEmployees(@Valid  @RequestBody EmployeesDto  employeesDto){
			System.out.println(employeesDto.getEmail());
		  EmployeesDto createEmployeesDto  = this.employeeService.createEmployees( employeesDto);
			return new ResponseEntity<> (createEmployeesDto , HttpStatus.CREATED);
		}   
	    
	
	//PUT-UPDATE USER
		
		   @PutMapping("/{employeeId}")
//		   @PreAuthorize("hasAuthority('ADMIN')")
		    public ResponseEntity<EmployeesDto> updateEmployees( @Valid @RequestBody EmployeesDto  employeesDto,@PathVariable("employeeId") Integer eid){
		    	
		    	EmployeesDto updateEmployees =this.employeeService.updateEmployees(employeesDto, eid);
		    	return ResponseEntity.ok(updateEmployees);
		    	
		    	
		    }
		    
		
		
	
	//DELETE -DELETE USER
		   
//		   @PreAuthorize("hasRole('ADMIN')")
//		   @PreAuthorize("hasAuthority('ADMIN')")
		   @DeleteMapping("/{employeeId}")
		    public ResponseEntity<ApiResponse>deleteEmployees( @PathVariable("employeeId") Integer eid){
		    	
		    	this.employeeService.deleteEmployees(eid);
		    	return new ResponseEntity<ApiResponse>(new ApiResponse("user deleted Succesfully",true),HttpStatus.OK);
		    }
	
	//GET - USER GET
		   @GetMapping("/")
//		   @PreAuthorize("hasAuthority('USER')")
		    public ResponseEntity<List<EmployeesDto>> getAllUser(){
			   List<EmployeesDto> e1=this.employeeService.getAllEmployees();
			   System.out.println(e1);
		    	return ResponseEntity.ok(this.employeeService.getAllEmployees());
		    }
		    
		    @GetMapping("/{employeeId}")
//		    @PreAuthorize("hasAuthority('USER')")
		    public ResponseEntity<EmployeesDto> getSingleUser( @PathVariable Integer employeeId){
		    	
		    	return ResponseEntity.ok(this.employeeService.getEmployeesById(employeeId));
		    }
		    
		    
//		    @PostMapping("/check")
//		    public void getdata(@RequestBody EmployeesDto  employeesDto) {
//		    	System.out.println(employeesDto.getEmail());
//		    	String email1=employeesDto.getEmail();
//		    	String password=employeesDto.getPassword();
//		    	employeesRepo.findByEmail(303);
////		    	String email2=employeeService.getdatabyemail(email1);
////		    	System.out.println("in controller"+email2);
//		    }
		    	
		 
//		    @GetMapping("/{email}")
//		    @PreAuthorize("hasAuthority('USER')")
//		    public Optional<Employees> findUserByEmail(@PathVariable String email){
//		        return employeeService.findByEmail(email);
//		    }
//		

//		    @PostMapping("/check")
//		    public void getdata() {
//		    	employeesRepo.findByEmail(303);
//		    }
		    
		    
		    @PostMapping("/logincheck")
//			   @PreAuthorize("hasAuthority('USER')")
			    public String getdata(@RequestBody EmployeesDto  employeesDto){
				   List<EmployeesDto> e1=this.employeeService.getAllEmployees();
				   System.out.println(employeesDto.getEmail());
				   String status="error";
				   String role="";
//				   String email = "URTY32@gmail.com";
				   String str=employeesDto.getEmail();
				   for(int i=0;i<e1.size();i++) {
//				   System.out.println("email====="+e1.get(i).getEmail());
					   System.out.println("role"+e1.get(i).getRoles());
					   if(str.equals(e1.get(i).getEmail())) {
						   System.out.println("successs");
						  
						   status=e1.get(i).getRoles();;
						   
						   break;
					   }
					   else {
						   status="error";
					   }
					   
				   }
				   System.out.println("status="+status);
			    	return status;
			    }

		    }
