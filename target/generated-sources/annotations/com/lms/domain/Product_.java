package com.lms.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Product.class)
public abstract class Product_ {

	public static volatile SingularAttribute<Product, String> productCode;
	public static volatile SingularAttribute<Product, Integer> productId;
	public static volatile SingularAttribute<Product, Float> price;
	public static volatile SingularAttribute<Product, Boolean> inStock;

}

