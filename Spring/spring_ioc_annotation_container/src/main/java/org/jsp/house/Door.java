package org.jsp.house;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Door implements House {

	String color;
	String material;
	
	public Door(@Value(value="brown")String color, @Value(value="wood")String material) {
		this.color = color;
		this.material = material;
	}

	public void property() {
		System.out.println("Door");
		System.out.println("color: "+color);
		System.out.println("material: "+material);
		
	}

}
