package com.ty.WA;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NWA")
public class Web extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
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

				PrintWriter ref=res.getWriter();
				ref.print("<html><body bgcolor='cyan'><h1>Id is "+id+" name is "+name+" place is "+place1+"role is"+role+"</h1></body></html>");

			}
			
			System.out.println("data inserted");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error");

			e.printStackTrace();
			System.out.println("error");
		}
		
		
	}

	}
