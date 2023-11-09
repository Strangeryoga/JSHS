package org.jsp.spring_ioc_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pen_User {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("pen.xml");
		Pen pen=(Pen)context.getBean("mypen");
		pen.buy(20);
		pen.write();
		pen.draw();
		
	}

}
