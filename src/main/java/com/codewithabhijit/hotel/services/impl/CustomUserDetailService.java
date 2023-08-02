//package com.codewithabhijit.hotel.services.impl;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.codewithabhijit.hotel.entities.Employees;
//import com.codewithabhijit.hotel.entities.User;
//import com.codewithabhijit.hotel.exceptions.ResourceNotFoundException;
//import com.codewithabhijit.hotel.repositories.EmployeesRepo;
//import com.codewithabhijit.hotel.repositories.UserRepo;
//
//
//@Service
//public class CustomUserDetailService implements UserDetailsService {
//	
//	
//	
//	@Autowired
//	private UserRepo userRepo;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		
//		User user =userRepo.findByEmail(username).orElseThrow(()->new RuntimeException("User not found"));
//		
//		
//		return (UserDetails) user;
//	}
//
//
//
//}
