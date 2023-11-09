package org.jsp.spring_ioc_annotation_container;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value(value="Dimple")
	String name;
	
	@Value(value="55.55")
	double percentage;
	
	@Value(value="8980909898")
	long mno;
	
	public void studentDetails() {

		
		System.out.println(name);
		System.out.println(percentage);
		System.out.println(mno);
	}

}
