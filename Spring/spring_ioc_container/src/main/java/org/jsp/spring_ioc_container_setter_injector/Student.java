package org.jsp.spring_ioc_container_setter_injector;

public class Student {
	
	private String name;
	private String address;
	private long mno;
	
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
	public long getMno() {
		return mno;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	public void come() {
		System.out.println("student is coming");
	}
	public void go() {
		System.out.println("student is going ");
	}
	

}
