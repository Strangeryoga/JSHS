package org.jsp.spring_ioc_container_setter_injector;

public class Person {

	private String name;
	private String address;
	private int mno;
	
	private Adhar adh;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public Adhar getAdh() {
		return adh;
	}

	public void setAdh(Adhar adh) {
		this.adh = adh;
	}
	
	
}