package com.org.workerforyou.util.convertor;

import org.springframework.stereotype.Component;

import com.org.workerforyou.dto.WorkerDto;
import com.org.workerforyou.model.Worker;

@Component
public class WorkerConvertor {
	
	public Worker convert(WorkerDto workerDto) {
		
		return Worker.builder().username(workerDto.getUsername()).role(workerDto.getRole()).build();
	}

	
	// workerdto -> worker
}
