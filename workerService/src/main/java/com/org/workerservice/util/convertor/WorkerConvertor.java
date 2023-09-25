package com.org.workerservice.util.convertor;

import org.springframework.stereotype.Component;

import com.org.workerservice.dto.WorkerDto;
import com.org.workerservice.model.Worker;

@Component
public class WorkerConvertor {
	
	public Worker convert(WorkerDto workerDto) {
		
		return Worker.builder().username(workerDto.getUsername()).role(workerDto.getRole()).build();
	}
}
