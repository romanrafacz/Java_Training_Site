package com.lms.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	//Optional<Customer, Integer> findByName();
	

}
