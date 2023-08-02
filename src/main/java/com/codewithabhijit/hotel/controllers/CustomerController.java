package com.codewithabhijit.hotel.controllers;

import java.util.List;

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

import com.codewithabhijit.hotel.payloads.ApiResponse;
import com.codewithabhijit.hotel.payloads.CustomerDto;
import com.codewithabhijit.hotel.services.CustomerService;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "http://localhost:3000") 
public class CustomerController {
	
	   @Autowired
	    private CustomerService customerService;
	   
	   //CREATE
	   @PostMapping("/")
//	   @PreAuthorize("hasAuthority('USER')")
	  
	    public ResponseEntity<CustomerDto> createRoom( @RequestBody CustomerDto customerDto) {
	        CustomerDto createCustomer = this.customerService.createCustomer(customerDto);
	        return new ResponseEntity<CustomerDto>(createCustomer, HttpStatus.CREATED);
	    }
	   
	   
	   
	   //UPDATE
	   
	   @PutMapping("/{customerId}")
//	   @PreAuthorize("hasAuthority('ADMIN')")
	    public ResponseEntity<CustomerDto> updateCustomer( @RequestBody CustomerDto customerDto, @PathVariable Integer customerId) {
	        CustomerDto updatedCustomer = this.customerService.updateCustomer(customerDto, customerId);
	        return new ResponseEntity<CustomerDto>(updatedCustomer, HttpStatus.OK);
	    }
	   
	   
	   //DELETE
	   
	   @DeleteMapping("/{customerId}")
//	   @PreAuthorize("hasAuthority('ADMIN')")
	    public ResponseEntity<ApiResponse> deleteCustomer(@PathVariable Integer customerId) {
	        this.customerService.deleteCustomer(customerId);
	        return new ResponseEntity<ApiResponse>(new ApiResponse("Customer  is deleted successfully", true), HttpStatus.OK);
	    }
	   
	   
	   
	   //GET 
	   
	   @GetMapping("/{customerId}")
//	   @PreAuthorize("hasAuthority('ADMIN')")
	    public ResponseEntity<CustomerDto> getCustomer(@PathVariable Integer customerId) {
	        CustomerDto customerDto = this.customerService.getCustomer(customerId);
	        return new ResponseEntity<CustomerDto>(customerDto, HttpStatus.OK);
	    }
	   
	   
	   //GET ALL
	   
	   @GetMapping("/")
//	   @PreAuthorize("hasAuthority('ADMIN')")
	    public ResponseEntity<List<CustomerDto>> getCustomers() {
	        List<CustomerDto> customers = this.customerService.getCustomers();
	        return ResponseEntity.ok(customers);
	    }

}
