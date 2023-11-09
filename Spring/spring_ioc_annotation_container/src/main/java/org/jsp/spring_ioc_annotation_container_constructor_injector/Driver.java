package org.jsp.spring_ioc_annotation_container_constructor_injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfig1.xml");
		Student student=context.getBean(Student.class,"student");
		student.studentDetails();
	}

}
