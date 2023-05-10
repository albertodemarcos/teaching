package com.taskweb.app.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
    @GetMapping(value = {"/", "/inicio", "/home"})
    public ResponseEntity<String> init() {
    	logger.debug("REST request initial"); 
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
	
	
}
