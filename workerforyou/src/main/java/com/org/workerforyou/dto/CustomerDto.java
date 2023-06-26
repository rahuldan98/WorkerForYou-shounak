package com.org.workerforyou.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //getter-setter
@AllArgsConstructor //parameterized constructor
public class CustomerDto {

	private Integer id;
	private String name;
}
