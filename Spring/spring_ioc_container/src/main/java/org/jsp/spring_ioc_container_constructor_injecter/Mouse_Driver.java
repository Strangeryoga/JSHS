package org.jsp.spring_ioc_container_constructor_injecter;

import org.jsp.spring_ioc_container.Bike;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mouse_Driver {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("mouse.xml");
		Mouse mouse=(Mouse)context.getBean("mymouse");
		mouse.detail();
	}
}
