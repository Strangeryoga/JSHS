package org.jsp.spring_ioc_container.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//this is using interface and constructor injector
public class Animal_Driver {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("animal.xml");
		
		AnimalSound ani=(AnimalSound)context.getBean("animalsound");
		ani.Sound();
		
		AnimalSound ani1=(AnimalSound)context.getBean("animalsound1");
		ani1.Sound();
		
	}
}
