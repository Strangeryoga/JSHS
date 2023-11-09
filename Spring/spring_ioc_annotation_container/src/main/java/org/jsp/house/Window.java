package org.jsp.house;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Window implements House {

	String name;
	String type;
		
	public Window(@Value(value="moon")String name, @Value(value="good")String type) {	
		this.name = name;
		this.type = type;
	}

	public void property() {
		System.out.println("Window");
		System.out.println("name: "+name);
		System.out.println("type: "+type);
		
	}

}
