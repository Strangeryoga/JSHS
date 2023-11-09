package org.jsp.Company_Details.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Company_dto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private String loc;
	private long mno;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address_dto address;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
	private List<Employee_dto> employee;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
	private List<Computer_dto> computer;
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public long getMno() {
		return mno;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	public Address_dto getAddress() {
		return address;
	}
	public void setAddress(Address_dto address) {
		this.address = address;
	}
	public List<Employee_dto> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee_dto> employee) {
		this.employee = employee;
	}
	public List<Computer_dto> getComputer() {
		return computer;
	}
	public void setComputer(List<Computer_dto> computer) {
		this.computer = computer;
	}
	
	
	
	

}
