package org.jsp.Bulding_Rooms_dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Generated;

@Entity
public class Rooms {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rid;
	private String rname;
	private String address;
	private double phoneno;
	

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(double phoneno) {
		this.phoneno = phoneno;
	}

	
	
	
	
	
}
