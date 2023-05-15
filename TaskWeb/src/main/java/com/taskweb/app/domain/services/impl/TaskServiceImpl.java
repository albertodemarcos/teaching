package com.taskweb.app.domain.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.taskweb.app.domain.dtos.TaskInputDTO;
import com.taskweb.app.domain.dtos.TaskOutDTO;
import com.taskweb.app.domain.services.TaskService;


@Service
public class TaskServiceImpl implements TaskService {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public TaskOutDTO createTask(TaskInputDTO taskInputDTO) {
		// TODO Auto-generated method stub
		logger.debug("createTask(taskInputDTO={})", taskInputDTO.toString() );
		return new TaskOutDTO();
	}

	@Override
	public TaskOutDTO updateTask(TaskInputDTO taskInputDTO) {
		// TODO Auto-generated method stub
		logger.debug("updateTask(taskInputDTO={})", taskInputDTO.toString() );
		return new TaskOutDTO();
	}

	@Override
	public TaskOutDTO getTask(Long idTask) {
		// TODO Auto-generated method stub
		logger.debug("getTask(taskInputDTO={})", idTask );
		return new TaskOutDTO();
	}

	@Override
	public TaskOutDTO deleteTask(Long idTask) {
		// TODO Auto-generated method stub
		logger.debug("deleteTask(taskInputDTO={})", idTask );
		return new TaskOutDTO();
	}
	
}
