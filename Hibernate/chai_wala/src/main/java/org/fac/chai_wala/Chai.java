package org.fac.chai_wala;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.*;
import javax.persistence.Persistence;
import javax.persistence.Table;


import com.mysql.cj.Query;
@Entity
@Table
public class Chai {

	@Id
	private int id;
	private String name;
	private String chai;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChai() {
		return chai;
	}
	public void setChai(String chai) {
		this.chai = chai;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "Chai [id=" + id + ", name=" + name + ", chai=" + chai + ", price=" + price + "]";
	}
	public static  void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev1");
		EntityManager em=e.createEntityManager();
		EntityTransaction t=em.getTransaction();
		
		Chai c=new Chai();
		c.setId(2);
		c.setName("sniper");
		c.setChai("cold chai");
		c.setPrice(100);
//		
//		t.begin();
//		em.merge(c);
//		t.commit();
		
		//find data
		Chai c1=em.find(Chai.class, 3);
		if(c1!=null) {
			System.out.println(c1);
		}else {
			System.out.println("data not found");
		}
		
		// to delete the data
		
//		t.begin();
//		em.remove(c1);
//		if(c1!=null) {
//			System.out.println("data deleted");
//		}else {
//			System.out.println("data not found");
//		}
//		t.commit();
		
		//findAll
		//Query q=em.createQuery("select b from Bike b");
		//List<Bike> l=q.getResultList();
		//System.out.println(l);
	javax.persistence.Query q=em.createQuery("select b from Chai b");
		List<Chai> l=q.getResultList();
		System.out.println(l);
		
		
		
		
		
		
		
	}
	
}
