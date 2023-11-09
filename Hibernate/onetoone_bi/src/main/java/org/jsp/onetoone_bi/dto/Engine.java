package org.jsp.onetoone_bi.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Engine {

	@Id
	private int id;
	private String cc;
	
	@OneToOne(cascade=CascadeType.ALL)

	private Car c;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public Car getC() {
		return c;
	}

	public void setC(Car c) {
		this.c = c;
	}
	
	
	
	
	
	
	
}
