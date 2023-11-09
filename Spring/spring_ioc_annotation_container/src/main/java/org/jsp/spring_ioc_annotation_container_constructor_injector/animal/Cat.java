package org.jsp.spring_ioc_annotation_container_constructor_injector.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class Cat implements Animal {
	


	public void doSound() {
		System.out.println("cat sounds meow meow");
		
	}

}
