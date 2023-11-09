package org.jsp.spring_ioc_container_setter_injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Person_Adhar_Driver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Person_Passport.xml");
		Person person=(Person)context.getBean("myperson");
		System.out.println(person.getName());
		System.out.println(person.getAddress());
		System.out.println(person.getMno());
		System.out.println("==============");
		System.out.println("Adhar details:");
		System.out.println(person.getAdh().getAno());
		System.out.println(person.getAdh().getState());
		
		
	}

}
