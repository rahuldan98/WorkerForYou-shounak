package com.org.workerforyou.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.workerforyou.model.Worker;

@Repository
public interface IWorkerRepository extends JpaRepository<Worker, Integer> {

	Optional<Worker> findByUsername(String username);

}
