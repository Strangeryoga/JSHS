package org.jp.onetomany_bi.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jp.onetomany_bi.dto.Company;
import org.jp.onetomany_bi.dto.Employee;

public class Comp_Emp_Dao {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("s1");
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
	
	public void saveCompany(Company company) {
		transaction.begin();
		List<Employee> employees=company.getEmployees();
		for(Employee emp:employees) {
			emp.setCompany(company);
		}
		manager.persist(company);
		transaction.commit();
	}
	
	public void saveEmployee(Employee employee) {
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
		
	}
	
	public void updateCompany(Company company) {
		transaction.begin();
		manager.merge(company);
		transaction.commit();
	}
	
	public void updateEmployee(Employee employee) {
		transaction.begin();
		manager.merge(employee);
		transaction.commit();
	}
}

