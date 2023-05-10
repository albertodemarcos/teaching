package com.taskweb.app.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalErrorExceptionHandler {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@ExceptionHandler(Exception.class)
    public ResponseEntity<String> exceptionHandler(){
		logger.debug("REST request error"); 
        return new ResponseEntity<>("Error!", HttpStatus.BAD_REQUEST);
    }
	
	

}
