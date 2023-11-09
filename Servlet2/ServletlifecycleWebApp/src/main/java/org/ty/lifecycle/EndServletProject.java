package org.ty.lifecycle;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class EndServletProject extends GenericServlet {
	
	//Object creation phase
	
	public EndServletProject() {
		System.out.println("servlet obj is created");
	}
	
	//Initialization 
	public void init() throws ServletException{
		System.out.println("servlet obj is initialized");
	}

	public void destroy() {
		System.out.println("servlet stop");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		
		System.out.println("service() is called...!!!!!!");
		
	}

}
