package org.aim.Car_wala;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;


import com.mysql.cj.Query;

@Entity
@Table
public class Car {

	@Id
	private int id;
	private String c_name;
	private String model;
	private double price;
	private String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", c_name=" + c_name + ", model=" + model + ", price=" + price + ", color=" + color
				+ "]";
	}
	
	
	
	public static void main(String[] args) {
		
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev3");
		
		EntityManager em=e.createEntityManager();
		
		EntityTransaction t=em.getTransaction();
		
		Car c=new Car();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter id");
//		c.setId(sc.nextInt());
//		
//		System.out.println("enter carname");
//		c.setC_name(sc.next());
//		
//		System.out.println("enter model");
//		c.setModel(sc.next());
//		
//		System.out.println("enter price");
//		c.setPrice(sc.nextDouble());
//		
//		System.out.println("enter color");
//		c.setColor(sc.next());
		
		Car c1=em.find(Car.class, 2);
		
//		System.out.println(c1.getC_name());
//		t.begin();
//		em.persist(c1);
//		t.commit();
//		t.begin();
//		em.remove(c1);
//		if(c1!=null) {
//			System.out.println("Data deleted");
//		}else {
//			System.out.println("data not found");
//		}
//		
//		t.commit();
		
//		javax.persistence.Query q=em.createQuery("select b from Car b");
//		List<Car> l=q.getResultList();
//		System.out.println(l);
	}
	
	
}
