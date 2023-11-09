package com.ty.composite_key.controller;

import com.ty.composite_key.dao.Flipkart_dao;
import com.ty.composite_key.dto.Flipkart;
import com.ty.composite_key.dto.Flipkart_Id;

public class Flipkart_controller {

	public static void main(String[] args) {
		
		Flipkart kart=new Flipkart();
		
		kart.setName("alia");
		kart.setPwd("ranbir@deepaka");
		kart.setAddress("mannat");
		
		Flipkart_Id id=new Flipkart_Id();
		id.setEmail("deepaka@ranveer");
		id.setMno(6666669999l);
		
		kart.setId(id);
		
		Flipkart_dao dao=new Flipkart_dao();
		dao.saveFlipkart(kart);
		
	}
}
