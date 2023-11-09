package org.jsp.spring_ioc_annotation_container_constructor_injector.animal;

import org.jsp.spring_ioc_annotation_container_setter_injector.animal.Animal_Sound;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnimalDriver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Animal1.xml");
		AnimalSound as=context.getBeansOfType(AnimalSound.class).get("animalSound");
		as.Details();
	
	}

}
