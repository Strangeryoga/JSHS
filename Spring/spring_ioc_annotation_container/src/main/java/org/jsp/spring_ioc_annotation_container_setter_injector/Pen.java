package org.jsp.spring_ioc_annotation_container_setter_injector;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//using getter and setter injector

@Component
public class Pen {
	
	private String name;
	private double price;
	private String color;
	
	public String getName() {
		return name;
	}
	
	@Value(value = "Reynolds")
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	@Value(value = "83")
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	@Value(value = "Blue")
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
