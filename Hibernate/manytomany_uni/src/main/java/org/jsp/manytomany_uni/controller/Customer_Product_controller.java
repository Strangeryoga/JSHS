package org.jsp.manytomany_uni.controller;

import java.util.*;

import org.jsp.manytomany_uni.dao.Customer_Product_dao;
import org.jsp.manytomany_uni.dto.Customer;
import org.jsp.manytomany_uni.dto.Product;

public class Customer_Product_controller {


	public static void main(String[] args) {
		Customer c=new Customer();
		c.setName("yogesh");
		c.setAddress("thane");
		c.setMobileno(8394893l);
		
		
		Product p=new Product();
		p.setName("mobile");
		p.setCost(83839);
		
		Product p1=new Product();
		p1.setName("umbrella");
		p1.setCost(199);
		
		Product p2=new Product();
		p2.setName("laptop");
		p2.setCost(838393);
		
		
		List<Product> list=new ArrayList<Product>();
		list.add(p);
		list.add(p1);
		list.add(p2);
		c.setProduct(list);
		
		
		Customer_Product_dao dao=new Customer_Product_dao();
		dao.saveCustomer(c);

	}
}
