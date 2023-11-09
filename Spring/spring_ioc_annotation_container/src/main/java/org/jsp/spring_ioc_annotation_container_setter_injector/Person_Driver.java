package org.jsp.spring_ioc_annotation_container_setter_injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//using autowired with g/s and constructor
public class Person_Driver {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("person.xml");
		Person p1=(Person) context.getBean("person");
		
		System.out.println(p1.getName());
		System.out.println(p1.getPen().getColor());
		
		p1.getStudent().studentDetails();
		
	}
}
