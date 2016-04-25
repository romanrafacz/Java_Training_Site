package com.lms.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lms.domain.MOrder;

public interface OrderRepository extends JpaRepository<MOrder, Integer> {
	
	@Query("SELECT code, quantity, orderDate from MOrder WHERE customer_id = (:customerId) ")
	List<MOrder> findOrderByCustomer(@Param("customerId") Integer customerId);

}
