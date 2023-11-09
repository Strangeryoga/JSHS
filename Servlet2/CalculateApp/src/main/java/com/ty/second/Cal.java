package com.ty.second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Cal extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String id1=req.getParameter("1");
		String id2=req.getParameter("2");
		
		PrintWriter ref=resp.getWriter();
		ref.print("<html><body bgcolor='cyan'><h1>Hello World</h1></body></html>");
	}

}
