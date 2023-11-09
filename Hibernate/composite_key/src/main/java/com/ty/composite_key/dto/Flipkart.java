package com.ty.composite_key.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Flipkart {
	
	private String name;
	private String pwd;
	private String address;
	
	@EmbeddedId
	private Flipkart_Id id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Flipkart_Id getId() {
		return id;
	}

	public void setId(Flipkart_Id id) {
		this.id = id;
	}
	
	
	
	
	

}
