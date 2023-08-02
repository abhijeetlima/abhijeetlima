//
//package com.codewithabhijit.hotel.controllers;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.codewithabhijit.hotel.entities.User;
//
//import com.codewithabhijit.hotel.services.UserService;
//
//
//
//
//
//@RestController
//@RequestMapping("/auth")
//public class UserController {
//	
//	
//
//		
//		
//	
//	    @Autowired
//	    private UserService userService;
//
//	    @PostMapping("/login")
//	    public ResponseEntity<String> login(@RequestBody Map<String, String> credentials) {
//	        String username = credentials.get("username");
//	        String password = credentials.get("password");
//
//	        User user = userService.getUserByUsername(username);
//
//	        if (user != null && user.getPassword().equals(password)) {
//	            return ResponseEntity.ok("Login successful!");
//	        } else {
//	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//	        }
//	    }
//	}

  
  
  
  
  
  
