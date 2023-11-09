package org.jsp.student.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.student.dto.Student;

public class Student_Dao {

	
	public void saveStudent(Student student) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("d1");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(student);
		transaction.commit();

	}
	
	public Student findById(int id) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("d1");
		EntityManager manager=factory.createEntityManager();
		return manager.find(Student.class, id);
	}
	
	public void update(Student student) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("d1");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.merge(student);
		transaction.commit();
		
	}
}
