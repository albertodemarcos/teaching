package com.taskweb.app.web.taks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping(value = "/tasks")
public class TaskRestController {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	/**
	 * Metodo para crear una task
	 * @param taskDTO
	 * @return
	 */
    @PostMapping(path = "/create" )
    public ResponseEntity<String> createTask(@ModelAttribute(name = "taskDTO") String taskDTO) {
    	logger.debug("REST request to save Task : {}", taskDTO);
        return new ResponseEntity<>("Create task", HttpStatus.OK);
    }
	
    /**
     * Metodo para actualizar una task
     * @param taskDTO
     * @return
     */
    @PutMapping("/update")
    public ResponseEntity<String> updateTask(@RequestBody String taskDTO) {
    	logger.debug("REST request to update Task : {}", taskDTO);       
        return new ResponseEntity<>("Update task", HttpStatus.OK);
    }
	
    /**
     * Metodo para obtener una task
     * @param idTaskStr
     * @return
     */
    @GetMapping("/task/{idTaskStr}")
    public ResponseEntity<String> getTask(@PathVariable String idTaskStr) {
    	logger.debug("REST request to get Task with id: {}", idTaskStr); 
        return new ResponseEntity<>("Get task", HttpStatus.OK);
    }
    
    /**
     * Metodo para eliminar una task
     * @param idTaskStr
     * @return
     */
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteTask(@RequestBody String idTaskStr) {
    	logger.debug("REST request to delete Task with id: {}", idTaskStr); 
        return new ResponseEntity<>("Delete task", HttpStatus.OK);
    }
}
