package com.codewithabhijit.hotel.services;

import java.util.List;

import com.codewithabhijit.hotel.payloads.CustomerDto;

public interface CustomerService {
	

    CustomerDto createCustomer(CustomerDto  customerDto);

    CustomerDto updateCustomer(CustomerDto customerDto,Integer customerId) ;

    CustomerDto getCustomer(Integer customerId) ;

    List<CustomerDto> getCustomers();

    void deleteCustomer(Integer customerId) ;


}
