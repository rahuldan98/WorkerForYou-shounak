package com.org.workerservice.service;

import java.util.List;

import com.org.workerservice.dto.CustomerDto;
import com.org.workerservice.model.Customer;
import com.org.workerservice.model.Worker;

public interface ICustomerService {
	
	public Customer register(CustomerDto customerDto);
	
	public Customer view(Integer id);
	
	public List<Customer> viewAll();
	
	public Customer update(Integer id, CustomerDto customerDto);
	
	public Customer delete(Integer id);
	
	public Worker request(Integer customerId, Integer workerId);

	
}
