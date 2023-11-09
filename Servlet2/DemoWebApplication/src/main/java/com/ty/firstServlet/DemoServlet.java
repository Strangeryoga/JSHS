package com.ty.firstServlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoServlet extends GenericServlet {

	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		try {
			//load and register the driver class
			Class.forName("com.mysql.jdbc.Driver");
			//for establishing the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			//for creating a platform or statement
			Statement stmt=(Statement) con.createStatement();
			String sql="select * from emp_info.employee";
			ResultSet rs=((java.sql.Statement) stmt).executeQuery(sql);
			while(rs.next()) {
				
				int id=rs.getInt(1);				
				String name=rs.getString(2);
				String role=rs.getString(3);
				String place1=rs.getString(4);

				PrintWriter ref=resp.getWriter();
				ref.print("<html><body bgcolor='cyan'><h1>Id is "+id+" name is "+name+" place is "+place1+"role is"+role+"</h1></body></html>");

			}
			
			
		} catch (Exception e) {
			System.out.println("error");
			
		}

	}

}