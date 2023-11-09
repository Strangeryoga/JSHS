package org.jsp.house;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HouseRegister {

	private House house;

	@Autowired
	public HouseRegister(@Qualifier(value="window")House house) {
		this.house = house;
	}
	
	public void details() {
		house.property();
	}
	
	
	
}
