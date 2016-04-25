package com.lms.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile SetAttribute<Customer, MOrder> morders;
	public static volatile SingularAttribute<Customer, CustomerProfile> customerProfile;
	public static volatile SingularAttribute<Customer, Integer> customerId;
	public static volatile SingularAttribute<Customer, String> name;

}

