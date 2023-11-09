package org.jsp.spring_ioc_container.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalSound  {

	private Animal animal;

	public AnimalSound(Animal animal) {
		super();
		this.animal = animal;
	}

	public void Sound() {
		animal.doSound();
		
	}
	
	
	
}

