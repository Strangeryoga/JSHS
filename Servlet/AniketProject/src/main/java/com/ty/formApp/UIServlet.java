package com.ty.formApp;

import javax.servlet.*;

import org.apache.tomcat.util.digester.Digester.EnvironmentPropertySource;

import java.io.IOException;

public class UIServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		
		System.out.println("name : "+name+" "+ place);
	}

}
