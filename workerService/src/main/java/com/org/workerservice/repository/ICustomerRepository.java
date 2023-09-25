package com.org.workerservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.workerservice.model.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

	Optional<Customer> findByName(String name);

}
