package com.org.workerforyou.dto;

import com.org.workerforyou.model.Role;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WorkerDto {
	
	private Integer id;
	private String name;
	private Role role;

}
