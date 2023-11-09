package org.jsp.Bulding_Rooms_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.Bulding_Rooms_dto.Bulding;
import org.jsp.Bulding_Rooms_dto.Rooms;

public class Bulding_Rooms_dao {

	private EntityManagerFactory factory=null;
	private EntityManager manager=null;
	private EntityTransaction transaction=null;
	
	public EntityManager getEntityManager() {
		factory= Persistence.createEntityManagerFactory("s3");
		manager=factory.createEntityManager();
		
		return manager;
	}
	
	
	public void saveBulding(Bulding bl) {
		manager=getEntityManager();
		transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(bl);
		transaction.commit();
	}
	
	public void saveRooms(Rooms rooms) {
		transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(rooms);
		transaction.commit();
	}
	
}
