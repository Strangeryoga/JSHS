package org.ty.spring_ioc_container_no_xml;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Food {
	
	@Id
	@Value(value="puran poli")
	private String name;
	@Value(value="100")
	private double price;
	@Value(value = "maharashtra")
	private String origin;
	
	public void details() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(origin);
	}

}
