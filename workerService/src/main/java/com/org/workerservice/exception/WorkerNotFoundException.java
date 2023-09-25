package com.org.workerservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class WorkerNotFoundException extends RuntimeException{
	
	private final String message;

}
