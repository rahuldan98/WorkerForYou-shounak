package com.org.workerservice.service;

import java.util.List;

import com.org.workerservice.dto.WorkerDto;
import com.org.workerservice.model.Customer;
import com.org.workerservice.model.Request;
import com.org.workerservice.model.Worker;

public interface IWorkerService {

	public Worker register(WorkerDto workerDto);

	public Worker view(Integer id);
	
	public List<Worker> viewAll();
	
	public Worker update(Integer id, WorkerDto workerDto);
	
	public Worker delete(Integer id);
	
	public List<Request> viewRequests(Integer id);
	
	public Customer acceptRequest(Integer requestId, Integer acceptanceFlag);
}
