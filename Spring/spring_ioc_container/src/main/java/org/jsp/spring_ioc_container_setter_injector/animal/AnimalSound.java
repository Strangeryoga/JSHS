package org.jsp.spring_ioc_container_setter_injector.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalSound{

	private Animal animal;

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public void Sound() {
		animal.doSound();
		
	}

	
	
	
	
}

