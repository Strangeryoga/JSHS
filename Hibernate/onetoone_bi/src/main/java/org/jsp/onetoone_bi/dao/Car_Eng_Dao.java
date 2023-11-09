package org.jsp.onetoone_bi.dao;

import java.util.jar.Attributes.Name;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetoone_bi.dto.Car;
import org.jsp.onetoone_bi.dto.Engine;

public class Car_Eng_Dao {

	private EntityManagerFactory factory=null;
	private EntityManager manager=null;
	private EntityTransaction transaction=null;
	
	public EntityManager getEntityManager() {
		factory= Persistence.createEntityManagerFactory("sheela");
		manager=factory.createEntityManager();
		
		return manager;
	}
	
	public void saveCar(Car car) {
		manager=getEntityManager();
		transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(car);
		transaction.commit();
	}
	
	public void saveCar1(Engine engine) {
		manager=getEntityManager();
		transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(engine);
		transaction.commit();
	}
	
	public void updateCar(Car car) {
		manager=getEntityManager();
		transaction=manager.getTransaction();
		transaction.begin();
		manager.merge(car);
		transaction.commit();
	}
	
	public void updateCar1(Engine engine) {
		manager=getEntityManager();
		transaction=manager.getTransaction();
		transaction.begin();
		manager.merge(engine);
		transaction.commit();
	}
	
	
}
