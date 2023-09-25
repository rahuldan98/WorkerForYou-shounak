package com.org.workerservice.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.org.workerservice.dto.CustomerDto;
import com.org.workerservice.exception.DuplicateCustomerException;
import com.org.workerservice.model.Customer;
import com.org.workerservice.model.Worker;
import com.org.workerservice.repository.ICustomerRepository;
import com.org.workerservice.service.ICustomerService;
import com.org.workerservice.util.convertor.CustomerConvertor;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements ICustomerService {

	private ICustomerRepository customerRepository;
	private CustomerConvertor customerConvertor;

	@Override
	public Customer register(CustomerDto customerDto) {

		Optional<Customer> optionalCustomer = customerRepository.findByName(customerDto.getName());
		if (optionalCustomer.isPresent())
			throw new DuplicateCustomerException("Customer already present");

		Customer customer = customerConvertor.convert(customerDto);
		return customerRepository.save(customer);
	}

	@Override
	public Customer view(Integer id) {

	}

	@Override
	public List<Customer> viewAll() {

	}

	@Override
	public Customer update(Integer id, CustomerDto customerDto) {

	}

	@Override
	public Customer delete(Integer id) {

	}

	@Override
	public Worker request(Integer customerId, Integer workerId) {

	}

}
