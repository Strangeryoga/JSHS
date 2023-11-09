package com.ty.composite_key.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.composite_key.dto.Flipkart;

public class Flipkart_dao {
	
	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("killer");
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
    public void saveFlipkart(Flipkart flipkart) {
		
		transaction.begin();
		manager.persist(flipkart);
		transaction.commit();
	}

	

}
