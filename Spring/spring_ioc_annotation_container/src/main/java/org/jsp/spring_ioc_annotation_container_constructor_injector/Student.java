package org.jsp.spring_ioc_annotation_container_constructor_injector;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	String name;
	double percentage;
	long mno;
	
	
	public Student(@Value(value="Dimple")String name,@Value(value="78.3") double percentage,@Value(value="893489283") long mno) {
		this.name = name;
		this.percentage = percentage;
		this.mno = mno;
	}


	public void studentDetails() {

		
		System.out.println(name);
		System.out.println(percentage);
		System.out.println(mno);
	}

}
