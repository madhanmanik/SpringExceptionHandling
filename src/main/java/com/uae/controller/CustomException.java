package com.uae.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomException extends ResponseEntityExceptionHandler{

	@ExceptionHandler(EmployeeNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	  public final ResponseEntity<ErrorDetails> handleUserNotFoundException(EmployeeNotFoundException ex, HttpServletRequest  request) {
		System.out.println("------------------>starts exception");
	    ErrorDetails errorDetails = new ErrorDetails();
	    errorDetails.setTimestamp(new Date());
	    errorDetails.setMessage(ex.getMessage());
	    errorDetails.setUri(request.getRequestURI());
		System.out.println("------------------>ends exception");
	    return new ResponseEntity(errorDetails, HttpStatus.NOT_FOUND);
	  }
	
}
