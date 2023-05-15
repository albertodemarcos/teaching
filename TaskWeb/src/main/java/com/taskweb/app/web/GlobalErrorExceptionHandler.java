package com.taskweb.app.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalErrorExceptionHandler implements ErrorController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@ExceptionHandler(Exception.class)
    public ResponseEntity<String> exceptionHandler(Exception e){
		logger.debug("REST request error"); 
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error api");
    }

}
