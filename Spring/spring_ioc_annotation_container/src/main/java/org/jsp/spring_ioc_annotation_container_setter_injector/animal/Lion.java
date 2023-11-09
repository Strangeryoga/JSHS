package org.jsp.spring_ioc_annotation_container_setter_injector.animal;

import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal{

	public void dosound() {
		System.out.println("ghruuuu");
		
	}

}
