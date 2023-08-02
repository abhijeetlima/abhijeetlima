 package com.codewithabhijit.hotel.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithabhijit.hotel.entities.Customer;
import com.codewithabhijit.hotel.exceptions.ResourceNotFoundException;
import com.codewithabhijit.hotel.payloads.CustomerDto;
import com.codewithabhijit.hotel.repositories.CustomerRepo;
import com.codewithabhijit.hotel.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	

	@Override
	public CustomerDto createCustomer(CustomerDto customerDto) {
		
		Customer customer = this.modelMapper.map(customerDto, Customer.class);
		
		Customer addedcustomer = this.customerRepo.save(customer);
	
		return this.modelMapper.map(addedcustomer,CustomerDto.class);
	}

	@Override
	public CustomerDto updateCustomer(CustomerDto customerDto, Integer customerId) {
		
		Customer customer = this.customerRepo.findById(customerId).orElseThrow(()-> new ResourceNotFoundException ("Customer","Customer Id",customerId) );
		
		customer.setName(customerDto.getName());
		customer.setGender(customerDto.getGender());
		customer.setDeposit(customerDto.getDeposit());
		customer.setCountry(customerDto.getCountry());
		customer.setCheckIn(customerDto.getCheckIn());
		customer.setAllocatedRoom(customerDto.getAllocatedRoom());
		
		Customer updatedRoom = this.customerRepo.save(customer);
		return this.modelMapper.map(updatedRoom, CustomerDto.class);
	}

	@Override
	public CustomerDto getCustomer(Integer customerId) {
		
		
		Customer customer = this.customerRepo.findById(customerId).orElseThrow(()-> new ResourceNotFoundException ("Customer","Customer Id",customerId) );
		
		
		return this.modelMapper.map(customer, CustomerDto.class);
	}

	@Override
	public List<CustomerDto> getCustomers() {
	    List<Customer> customers = this.customerRepo.findAll();
	    List<CustomerDto> customerDtos = customers.stream()
	            .map(c -> this.modelMapper.map(c, CustomerDto.class))
	            .collect(Collectors.toList());

	    return customerDtos;
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		
		Customer customer = this.customerRepo.findById(customerId).orElseThrow(()->new ResourceNotFoundException ("Customer","customer id",customerId));
		
       this.customerRepo.delete(customer);
	}

}
