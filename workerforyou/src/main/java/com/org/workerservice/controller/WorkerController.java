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

import com.org.workerforyou.dto.WorkerDto;
import com.org.workerforyou.model.Customer;
import com.org.workerforyou.model.Worker;
import com.org.workerforyou.service.IWorkerService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/worker")
public class WorkerController {

	private IWorkerService workerService;

	@PostMapping("/register")
	public ResponseEntity<Worker> register(@RequestBody WorkerDto workerDto) {

		return new ResponseEntity<>(workerService.register(workerDto), HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Worker> view(@PathVariable Integer id) {

		return new ResponseEntity<>(workerService.view(id), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Worker>> viewAll() {

		return new ResponseEntity<>(workerService.viewAll(), HttpStatus.OK);
	}

	@PatchMapping("/{id}")
	public ResponseEntity<Worker> update(@PathVariable Integer id, @RequestBody WorkerDto workerDto) {

		return new ResponseEntity<>(workerService.update(id, workerDto), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Worker> delete(@PathVariable Integer id) {

		return new ResponseEntity<>(workerService.delete(id), HttpStatus.OK);
	}

	@PostMapping("/{requestId}/{acceptanceFlag}")
	public ResponseEntity<Customer> acceptRequest(@PathVariable Integer requestId,
			@PathVariable Integer acceptanceFlag) {

		return new ResponseEntity<>(workerService.acceptRequest(requestId, acceptanceFlag), HttpStatus.OK);
	}

}
