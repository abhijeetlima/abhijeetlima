package com.codewithabhijit.hotel.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.codewithabhijit.hotel.payloads.ApiResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> resourceNotFoundExceptionHandler(ResourceNotFoundException ex){
		
		String message =ex.getMessage();
		ApiResponse NewResponse = new ApiResponse(message,false);
		return new ResponseEntity<ApiResponse>(NewResponse,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String ,String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
		
		Map<String,String> resp =new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error)->{
			String fieldName =((FieldError)error).getField();
			String message = error.getDefaultMessage();
			resp.put(fieldName, message);
			
		});
	
		return new ResponseEntity<Map<String,String>>(resp,HttpStatus.BAD_REQUEST);
		
	
		
	}
	
	/*
	 * @ExceptionHandler(ApiException.class) public ResponseEntity<NewResponse>
	 * handleApiException(ApiException ex) { String message = ex.getMessage();
	 * NewResponse NewResponse = new NewResponse(message, true); return new
	 * ResponseEntity<NewResponse>(NewResponse, HttpStatus.BAD_REQUEST); }
	 */
}
