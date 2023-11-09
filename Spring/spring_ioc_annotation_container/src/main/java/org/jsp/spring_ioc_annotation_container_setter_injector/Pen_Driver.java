package org.jsp.spring_ioc_annotation_container_setter_injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pen_Driver {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Pen.xml");
		Pen p=(Pen) context.getBean("pen");
		
		
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		System.out.println(p.getColor());

		
	}

}
