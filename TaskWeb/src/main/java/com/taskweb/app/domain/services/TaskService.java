package com.taskweb.app.domain.services;

import com.taskweb.app.domain.dtos.TaskInputDTO;
import com.taskweb.app.domain.dtos.TaskOutDTO;

public interface TaskService {

    public TaskOutDTO createTask(TaskInputDTO taskDTO);
   
    public TaskOutDTO updateTask(TaskInputDTO taskDTO);

   	public TaskOutDTO getTask(Long idTask);
    
    public TaskOutDTO deleteTask(Long idTask);
}
