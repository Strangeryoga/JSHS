package org.jsp.spring_ioc_container_setter_injector.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//this is using interface and setter injector
public class Animal_Driver {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("animal1.xml");
		
		AnimalSound ani=(AnimalSound)context.getBean("animalsound");
		ani.Sound();
		
		AnimalSound ani1=(AnimalSound)context.getBean("animalsound1");
		ani1.Sound();
		
		
		
		
	}
}
