package org.jsp.manytomany_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.manytomany_uni.dto.Customer;

public class Customer_Product_dao {

	private EntityManagerFactory factory=null;
	private EntityManager manager=null;
	private EntityTransaction transaction=null;
	
	public EntityManager getEntityManager() {
		factory= Persistence.createEntityManagerFactory("yoyo");
		manager=factory.createEntityManager();
		
		return manager;
	}
	
	public void saveCustomer(Customer customer) {
		manager=getEntityManager();
		transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(customer);
		transaction.commit();
	}
}
