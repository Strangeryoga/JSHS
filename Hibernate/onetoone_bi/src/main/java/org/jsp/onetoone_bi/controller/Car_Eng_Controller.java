package org.jsp.onetoone_bi.controller;

import org.jsp.onetoone_bi.dao.Car_Eng_Dao;
import org.jsp.onetoone_bi.dto.Car;
import org.jsp.onetoone_bi.dto.Engine;

public class Car_Eng_Controller {

	public static void main(String[] args) {
		Engine engine=new Engine();
		engine.setId(2);
		engine.setCc("106032cc");
		
		Car car=new Car();
		car.setId(1001);
		car.setName("xuv1");
		car.setColor("black");
		car.setPrice(323242);
		car.setEngine(engine);
		
		
		engine.setC(car);
		
		Car_Eng_Dao CED=new Car_Eng_Dao();
		
//		CED.saveCar(car);
//		CED.saveCar1(engine);
//		CED.updateCar(car);
//		CED.updateCar1(engine);
		
	}
}
