package org.jsp.spring_ioc_annotation_container_setter_injector.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Animal_Sound {
	
	private Animal animal;

	public Animal getAnimal() {
		return animal;
	}

	@Autowired
	@Qualifier(value="cow")
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public void details() {
		animal.dosound();
	}

}
