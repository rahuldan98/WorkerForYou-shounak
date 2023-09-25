package com.org.workerservice.util.convertor;

import org.springframework.stereotype.Component;

import com.org.workerservice.dto.CustomerDto;
import com.org.workerservice.model.Customer;

@Component
public class CustomerConvertor {

	public Customer convert(CustomerDto customerDto) {

		return Customer.builder().name(customerDto.getName()).build();
	}

}
