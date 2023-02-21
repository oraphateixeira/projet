package com.yan.projeto.resources.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.yan.projeto.services.exceptions.ObjectnotFoundExpection;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExpectionHandler {

	@ExceptionHandler(ObjectnotFoundExpection.class)
	public ResponseEntity<StandardError> objectnotFoundExpection(ObjectnotFoundExpection ex, 
			HttpServletRequest request){
		
		StandardError error = new StandardError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(),
				"Object Not Found", ex.getMessage(), request.getRequestURI());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
		
	}
}
