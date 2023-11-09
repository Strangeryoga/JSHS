package org.jsp.Company_Details.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee_dto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String ename;
	private String address;
	private long contactno;
	
	@ManyToOne(cascade = CascadeType.ALL )
	@JoinColumn
	private Company_dto company;
	@OneToOne(cascade = CascadeType.ALL)
	private Computer_dto computer;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Skills_dto> list;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public Company_dto getCompany() {
		return company;
	}

	public void setCompany(Company_dto company) {
		this.company = company;
	}

	public Computer_dto getComputer() {
		return computer;
	}

	public void setComputer(Computer_dto computer) {
		this.computer = computer;
	}

	public List<Skills_dto> getList() {
		return list;
	}

	public void setList(List<Skills_dto> list) {
		this.list = list;
	}
	
	
	
	
	
	
	
}
