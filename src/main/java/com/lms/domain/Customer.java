package com.lms.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
 
@Entity
@Table(name = "CUSTOMER")
public class Customer implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id", nullable = false)
    private Integer customerId;
 
    @Column(name = "NAME", nullable = false, length = 20)
    private String name;
 
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    private Set<MOrder> morders = new HashSet<MOrder>(0);
    
    @OneToOne(mappedBy="customer", fetch=FetchType.LAZY)
    private CustomerProfile customerProfile;
    
    public Customer(){
    	
    }
    
    public Customer(String name, CustomerProfile customerProfile){
    	this.name = name;
    	this.customerProfile = customerProfile;
    }

    public CustomerProfile getCustomerProfile() {
		return customerProfile;
	}

	public void setCustomerProfile(CustomerProfile customerProfile) {
		this.customerProfile = customerProfile;
	}
 
    public Customer(String name) {
        this.name = name;
    }
 
    public int getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Set<MOrder> getMOrders() {
        return morders;
    }
 
    public void setOrders(Set<MOrder> morders) {
        this.morders = morders;
    }
 
}
