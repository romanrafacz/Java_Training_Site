package com.lms.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CustomerProfile.class)
public abstract class CustomerProfile_ {

	public static volatile SingularAttribute<CustomerProfile, Integer> profileId;
	public static volatile SingularAttribute<CustomerProfile, String> email;
	public static volatile SingularAttribute<CustomerProfile, Customer> customer;

}

