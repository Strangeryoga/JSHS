package org.jsp.Company_Details.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address_dto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private long pcode;
	private String state;
	
	@OneToOne(cascade = CascadeType.ALL )
	private Company_dto company;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPcode() {
		return pcode;
	}

	public void setPcode(long pcode) {
		this.pcode = pcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Company_dto getCompany() {
		return company;
	}

	public void setCompany(Company_dto company) {
		this.company = company;
	}
	
	
	
	
}
