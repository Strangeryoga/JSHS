package org.jsp.oneToMany_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.oneToMany_uni.dto.Flipkart_Customer;
import org.jsp.oneToMany_uni.dto.Items;

public class FilpKart_Items_Dao {
	
	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("sheela1");
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
	public void saveFlipkarCustomer(Flipkart_Customer FC) {
		
		transaction.begin();
		manager.persist(FC);
		transaction.commit();
		
	}
	
	public void updateFlipkarCustomer(Flipkart_Customer FC) {
		transaction.begin();
		manager.merge(FC);
		transaction.commit();
	}
	
	
	public void addKart(int id,List<Items> items) {
		Flipkart_Customer customer=manager.find(Flipkart_Customer.class, id);
		if(customer!=null) {
			List<Items> list=customer.getItems();
			transaction.begin();
			list.addAll(items);
			customer.setItems(list);
			
			manager.merge(customer);
			transaction.commit();
		}else {
			System.out.println(id+" not found");
		}
	}
	
	public void removeKart(int id,List<Items> items) {
		Flipkart_Customer customer=manager.find(Flipkart_Customer.class, id);
		if(customer!=null) {
			List<Items> list=customer.getItems();
			transaction.begin();
			list.remove(list);
			customer.setItems(list);
			
			manager.merge(customer);
			transaction.commit();
		}else {
			System.out.println(id+" not found");
		}
	}

	
	

}
