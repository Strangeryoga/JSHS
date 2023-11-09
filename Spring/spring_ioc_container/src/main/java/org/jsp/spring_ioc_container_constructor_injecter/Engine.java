package org.jsp.spring_ioc_container_constructor_injecter;

public class Engine {
	
	String eno;
	String cc;
	
	public String toString() {
		return eno;
		
	}
	
	
	public Engine(String eno, String cc) {
		super();
		this.eno = eno;
		this.cc = cc;
	}
	
	
	
	public void EngineDetails() {
		System.out.println(eno);
		System.out.println(cc);
	}
	
	

	
	
	

	
}
