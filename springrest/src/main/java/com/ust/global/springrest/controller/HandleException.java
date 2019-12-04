package com.ust.global.springrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
/* @ControllerAdvice--------it advice the controller to which exception/ method to handle (it is for spring mvc)
 * @RestControllerAdvice-------(it is for spring rest)*/
public class HandleException {
	@ExceptionHandler(Exception.class)
	/* @ExceptionHandler---it can accept any type of exception */
	public EmployeeResponse getException() {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Error in code");
		response.setDescription("got an exception");
		return response;
		
	}

}
