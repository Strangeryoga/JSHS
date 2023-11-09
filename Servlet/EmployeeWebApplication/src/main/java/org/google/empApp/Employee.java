package org.google.empApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.sql.*;
public class Employee extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("nm");
		String role=req.getParameter("rl");
		String place=req.getParameter("pl");
		
		System.out.println("id is "+id+"name is "+name+"role is "+role+"place is "+place);
		
		PrintWriter ref=resp.getWriter();
		ref.print("<html><body bgcolor='cyan'><h1>Details"+id+" "+name+" "+role+" "+place +" "+"</h1></body></html>");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			PreparedStatement ps=con.prepareStatement("insert into emp_info.employee values(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, role);
			ps.setString(4, place);
			
			ps.executeUpdate();
		} catch (Exception e) {
			
		}
		

	}

}
