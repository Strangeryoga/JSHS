package org.jsp.Details_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
//import jakarta.persistence.Persistence;


import org.jsp.Details_dto.Details_dto;


public class Details_dao {
	
	 EntityManagerFactory factory=Persistence.createEntityManagerFactory("abc123");
	 EntityManager manager=factory.createEntityManager();
	 EntityTransaction transaction=manager.getTransaction();
	
	
	
	public void saveCustomer(Details_dto det) {
		transaction.begin();
		manager.persist(det);
		transaction.commit();
	}

}
