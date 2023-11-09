package org.jsp.spring_ioc_annotation_container_setter_injector.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//this is using getter and setter
public class Animal_Driver {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Animal.xml");
		Animal_Sound as= context.getBean("animal_Sound",Animal_Sound.class);
		as.details();
		
		
	}
}
