package org.jsp.bike_wala;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

@Entity
@Table
public class Bike {
	
	@Id
	private int id;
	private String name;
	private String color;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager em=e.createEntityManager();
		EntityTransaction t=em.getTransaction();
		
		Bike b=new Bike();
		b.setId(102);
		b.setName("honda");
		b.setColor("red");
		b.setPrice(73829);
		
//		t.begin();
		//em.persist(b); it is used to only insert the data
		//em.merge(b); it is used to insert data as well as to update the data
//		em.merge(b);
//		t.commit();
		
		//find data
		
//		Bike b1=em.find(Bike.class, 101);
//		System.out.println(b1);
		t.begin();
		em.persist(b);
		t.commit();
		
		
		
			}
	

}
