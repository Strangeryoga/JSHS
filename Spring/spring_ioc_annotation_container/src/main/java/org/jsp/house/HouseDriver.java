package org.jsp.house;

import org.jsp.spring_ioc_annotation_container_constructor_injector.animal.AnimalSound;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HouseDriver {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("House.xml");
		HouseRegister reg=context.getBean(HouseRegister.class,"houseRegister");
		reg.details();
	}

}
