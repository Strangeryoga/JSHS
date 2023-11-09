package org.jsp.spring_ioc_container.unicorn;

public class Unicorn implements Bird,Horse {
	
	public void eat() {
		System.out.println("Horse eats grass");
	}

	public static void main(String[] args)  {
		new Unicorn().eat();
		

	}
	
	
	

}
