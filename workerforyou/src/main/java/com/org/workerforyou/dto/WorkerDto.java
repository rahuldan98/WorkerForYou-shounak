package com.org.workerforyou.dto;

import com.org.workerforyou.model.Role;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WorkerDto {
	
	private String username;
	private Role role;
	
	

}
