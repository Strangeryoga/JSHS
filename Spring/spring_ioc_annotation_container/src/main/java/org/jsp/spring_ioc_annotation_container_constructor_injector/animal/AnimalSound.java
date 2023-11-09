package org.jsp.spring_ioc_annotation_container_constructor_injector.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalSound {
	
	private Animal animal;

	@Autowired
	public AnimalSound(@Qualifier(value="cat")Animal animal) {
		
		this.animal = animal;
	}
	
	public void Details() {
		animal.doSound();
	}

}
