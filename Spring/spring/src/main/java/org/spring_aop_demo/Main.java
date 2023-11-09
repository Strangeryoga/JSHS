package org.spring_aop_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context
		=new AnnotationConfigApplicationContext(BeanConfig.class);
		
		ShoppingCart cart=context.getBean(ShoppingCart.class);
		cart.checkout();
	}

}
