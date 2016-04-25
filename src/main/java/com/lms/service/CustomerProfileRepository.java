package com.lms.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.domain.CustomerProfile;

public interface CustomerProfileRepository extends JpaRepository<CustomerProfile, Integer> {

}
