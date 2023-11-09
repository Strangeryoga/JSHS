package org.jsp.Company_Details.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Skills_dto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String skill;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Employee_dto employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Employee_dto getEmployee() {
		return employee;
	}

	public void setEmployee(Employee_dto employee) {
		this.employee = employee;
	}
	
	
	
	
	
	
}
