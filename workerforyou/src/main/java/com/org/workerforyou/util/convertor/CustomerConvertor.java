package com.org.workerforyou.util.convertor;

import org.springframework.stereotype.Component;

import com.org.workerforyou.dto.CustomerDto;
import com.org.workerforyou.model.Customer;

@Component
public class CustomerConvertor {

	public Customer convert(CustomerDto customerDto) {

		return Customer.builder().name(customerDto.getName()).build();
	}

}
