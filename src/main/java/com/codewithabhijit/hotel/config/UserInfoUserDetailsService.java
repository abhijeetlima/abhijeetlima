//package com.codewithabhijit.hotel.config;
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
//import com.codewithabhijit.hotel.services.EmployeesService;
//
//@Service
//public class UserInfoUserDetailsService   implements UserDetailsService {
//	
//	
//	@Autowired
//	private EmployeesService employeesService;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		Optional<Employees> employees =  employeesService.findByEmail(username);
//		return employees.map(UserInfoDetails::new).orElseThrow(()->new UsernameNotFoundException("HEY username not found"));
//	}
//
//
//}
