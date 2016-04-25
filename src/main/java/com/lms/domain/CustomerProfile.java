package com.lms.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="customer_profile")
public class CustomerProfile implements Serializable {
	
	@Id
	@Column(name="customer_profile_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer profileId;
	
	@Column(name="email")
	private String email;
	
	@OneToOne
	@JoinColumn(name = "CUSTOMER_ID", nullable = false)
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}
	
	public CustomerProfile(){
	}

	
	public CustomerProfile(String email){
		this.email = email;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}
	
	
}
