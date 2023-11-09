package org.jsp.Company_Details.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.Company_Details.dao.Company_Details_dao;
import org.jsp.Company_Details.dto.Address_dto;
import org.jsp.Company_Details.dto.Company_dto;
import org.jsp.Company_Details.dto.Computer_dto;
import org.jsp.Company_Details.dto.Employee_dto;
import org.jsp.Company_Details.dto.Skills_dto;

public class Company_details_controller {
	public static void main(String[] args) {
		Company_dto company=new Company_dto();
		company.setName("tcs");
		company.setEmail("tcs@gmail.com");
		company.setLoc("mumbai");
		company.setMno(9209309l);
		
		Address_dto address=new Address_dto();
		address.setPcode(829383l);
		address.setState("maharashtra");
		address.setCompany(company);
		company.setAddress(address);
		
		Employee_dto employee1=new Employee_dto();
		employee1.setEname("yogesh");
		employee1.setAddress("thane");
		employee1.setContactno(893892l);
		employee1.setCompany(company);
		
		
		Employee_dto employee2=new Employee_dto();
		employee2.setEname("yogesh");
		employee2.setAddress("thane");
		employee2.setContactno(893892l);
		employee2.setCompany(company);
		
		List<Employee_dto> list=new ArrayList<Employee_dto>();
		list.add(employee1);
		list.add(employee2);
		company.setEmployee(list);
		
		Computer_dto computer =new Computer_dto();
		computer.setBrand("HP");
		computer.setPrice(728743);
		computer.setCompany(company);
		computer.setEmployee(employee1);
		employee1.setComputer(computer);
		
		Computer_dto computer1 =new Computer_dto();
		computer1.setBrand("Asus");
		computer1.setPrice(3823938);
		computer1.setCompany(company);
		computer1.setEmployee(employee2);
		employee2.setComputer(computer1);
		
		List<Computer_dto> computer2=new ArrayList<Computer_dto>();
		computer2.add(computer);
		computer2.add(computer1);
		company.setComputer(computer2);
		
		Skills_dto skills1=new Skills_dto();
		skills1.setSkill("java");
		skills1.setEmployee(employee1);
		
		Skills_dto skills2=new Skills_dto();
		skills2.setSkill("java");
		skills2.setEmployee(employee2);
		
		
		List<Skills_dto> sk=new ArrayList<Skills_dto>();
		sk.add(skills1);
		employee1.setList(sk);
		
		List<Skills_dto> sk1=new ArrayList<Skills_dto>();
		sk1.add(skills2);
		employee2.setList(sk1);
		
		
		
		
		Company_Details_dao dao=new Company_Details_dao();
		dao.saveCompany(company);

	}

}