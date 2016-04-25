package com.lms.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MOrder.class)
public abstract class MOrder_ {

	public static volatile SingularAttribute<MOrder, String> code;
	public static volatile SingularAttribute<MOrder, Integer> quantity;
	public static volatile SingularAttribute<MOrder, Integer> orderId;
	public static volatile SingularAttribute<MOrder, Date> orderDate;
	public static volatile SingularAttribute<MOrder, Customer> customer;

}

