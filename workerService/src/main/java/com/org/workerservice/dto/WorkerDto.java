package com.org.workerservice.dto;

import com.org.workerservice.model.Role;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WorkerDto {
	
	private String username;
	private Role role;
	
	

}
