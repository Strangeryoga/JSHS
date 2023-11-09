package com.ty.composite_key.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Flipkart_Id  implements Serializable{
	
	private String email;
	private long mno;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMno() {
		return mno;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	
	

}
