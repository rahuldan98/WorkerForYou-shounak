package com.org.workerforyou.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.workerforyou.dto.CustomerDto;
import com.org.workerforyou.model.Customer;
import com.org.workerforyou.model.Worker;
import com.org.workerforyou.service.ICustomerService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

	private ICustomerService customerService;

	@PostMapping("/register")
	public ResponseEntity<Customer> register(@RequestBody CustomerDto customerDto) {

		return new ResponseEntity<>(customerService.register(customerDto), HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Customer> view(@PathVariable Integer id) {

		return new ResponseEntity<>(customerService.view(id), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Customer>> viewAll() {

		return new ResponseEntity<>(customerService.viewAll(), HttpStatus.OK);
	}

	@PatchMapping("/{id}")
	public ResponseEntity<Customer> update(@PathVariable Integer id, @RequestBody CustomerDto customerDto) {

		return new ResponseEntity<>(customerService.update(id, customerDto), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Customer> delete(@PathVariable Integer id) {

		return new ResponseEntity<>(customerService.delete(id), HttpStatus.OK);
	}

	@PostMapping("/{customerId}/{workerId}")
	public ResponseEntity<Worker> request(Integer customerId, Integer workerId) {

		return new ResponseEntity<>(customerService.request(customerId, workerId), HttpStatus.OK);
	}

}
