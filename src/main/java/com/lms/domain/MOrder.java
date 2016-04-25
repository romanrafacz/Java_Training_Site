package com.lms.domain;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
 
@Entity
@Table(name = "customer_order")
public class MOrder implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID", nullable = false)
    private Integer orderId;
 
    @Column(name = "CODE", nullable = false, length = 20)
    private String code;
 
    @Column(name = "ORDER_DATE", length = 10)
    private Date orderDate;
    
    @Column(name="quantity")
    private Integer quantity;
 
    public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    private Customer customer;
 
    public MOrder() {
    }
 
    public MOrder(String code, Float amount, Date orderDate) {
        this.code = code;
        this.orderDate = orderDate;
    }
 
    public int getOrderId() {
        return orderId;
    }
 
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
 
    public String getCode() {
        return code;
    }
 
    public void setCode(String code) {
        this.code = code;
    }
 
    public Date getOrderDate() {
        return orderDate;
    }
 
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
 
    public Customer getCustomer() {
        return customer;
    }
 
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
