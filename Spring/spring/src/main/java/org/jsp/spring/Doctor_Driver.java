package org.jsp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Doctor_Driver {

	public static void main(String[] args) {
//		ApplicationContext context=new ClassPathXmlApplicationContext("doctor.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
		Doctor dct=context.getBean(Doctor.class);
		Nurse nr=context.getBean(Nurse.class);
		dct.assist();
		nr.nurse();
	}
}
