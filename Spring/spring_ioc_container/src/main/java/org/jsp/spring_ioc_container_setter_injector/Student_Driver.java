package org.jsp.spring_ioc_container_setter_injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Driver {

	public static void main(String[] args) {
//		ApplicationContext context=new ClassPathXmlApplicationContext("student.xml"); 
//	    Student student=(Student) context.getBean("mystudent");
//	    System.out.println(student.getName());
//	    System.out.println(student.getAddress());
//	    System.out.println(student.getMno());
	    
	    
		ApplicationContext context=new ClassPathXmlApplicationContext("student.xml"); 
	    Student student=(Student) context.getBean("mystudent");
	    System.out.println(student.getName());
	    System.out.println(student.getAddress());
	    System.out.println(student.getMno());
	    ((AbstractApplicationContext) context).close();
	
}
}