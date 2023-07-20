package com.org.workerforyou.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.org.workerforyou.dto.WorkerDto;
import com.org.workerforyou.exception.DuplicateWorkerException;
import com.org.workerforyou.exception.WorkerNotFoundException;
import com.org.workerforyou.model.Customer;
import com.org.workerforyou.model.Worker;
import com.org.workerforyou.repository.IWorkerRepository;
import com.org.workerforyou.service.IWorkerService;
import com.org.workerforyou.util.convertor.WorkerConvertor;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class WorkerServiceImpl implements IWorkerService {

	private IWorkerRepository workerRepository;
	private WorkerConvertor workerConvertor;

	@Override
	public Worker register(WorkerDto workerDto) {

		Optional<Worker> optionalWorker = workerRepository.findByUsername(workerDto.getUsername());

		if (optionalWorker.isPresent())
			throw new DuplicateWorkerException("Duplicate worker present");

		Worker worker = workerConvertor.convert(workerDto);
		return workerRepository.save(worker);

	}

	@Override
	public Worker view(Integer id) {

		return workerRepository.findById(id).orElseThrow(() -> new WorkerNotFoundException("worker not found"));
	}

	@Override
	public List<Worker> viewAll() {

		return workerRepository.findAll();
	}

	@Override
	public Worker update(Integer id, WorkerDto workerDto) {

		Worker worker = workerRepository.findById(id)
				.orElseThrow(() -> new WorkerNotFoundException("Worker not found"));
		worker.setUsername(workerDto.getUsername());
		worker.setRole(workerDto.getRole());

		return workerRepository.save(worker);
	}

	@Override
	public Worker delete(Integer id) {

		Optional<Worker> optionalWorker = Optional.ofNullable(
				workerRepository.findById(id).orElseThrow(() -> new WorkerNotFoundException("Worker not found")));
		workerRepository.deleteById(id);
		return optionalWorker.get();
	}

	@Override
	public Customer acceptRequest(Integer requestId, Integer acceptanceFlag) {
		// TODO Auto-generated method stub
		return null;
	}

}
