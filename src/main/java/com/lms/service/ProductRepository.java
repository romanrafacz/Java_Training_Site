package com.lms.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
