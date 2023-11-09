package org.jsp.spring_ioc_annotation_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
		Student student=context.getBean(Student.class,"student");
		student.studentDetails();
	}

}
