package com.org.workerforyou.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.org.workerforyou.dto.CustomerDto;
import com.org.workerforyou.exception.DuplicateCustomerException;
import com.org.workerforyou.model.Customer;
import com.org.workerforyou.model.Worker;
import com.org.workerforyou.repository.ICustomerRepository;
import com.org.workerforyou.service.ICustomerService;
import com.org.workerforyou.util.convertor.CustomerConvertor;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer update(Integer id, CustomerDto customerDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Worker request(Integer customerId, Integer workerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
