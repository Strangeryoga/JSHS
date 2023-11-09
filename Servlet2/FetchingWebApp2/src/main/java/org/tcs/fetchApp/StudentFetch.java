package org.tcs.fetchApp;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FWA")
public class StudentFetch extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			PreparedStatement st=con.prepareStatement("select * from info.student");
			PreparedStatement st1=con.prepareStatement("select * from emp_info.employee");
//			java.sql.Statement st=con.createStatement();
//			
//			ResultSet rs=((java.sql.Statement) st).executeQuery("select * from info.student");
//			ResultSet rs1=((java.sql.Statement) st).executeQuery("select * from emp_info.employee");

			ResultSet rs=st.executeQuery();
			ResultSet rs1=st1.executeQuery();
			
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String place=rs.getString(3);
				

				PrintWriter ref=resp.getWriter();
				ref.print("<html><body bgcolor='cyan'><h1>Id is "+id+" name is "+name+" place is "+place+"</h1></body></html>");

			}
			
			while(rs1.next()) {
				int id1=rs1.getInt(1);
				String name1=rs1.getString(2);
				String role=rs1.getString(3);
				String place1=rs1.getString(4);
				
				PrintWriter ref=resp.getWriter();
				ref.print("<html><body bgcolor='cyan'><h1>Id is "+id1+" name is "+name1+" place is "+role+"</h1></body></html>");
			}
			
		} catch (Exception e) {
			
		}
	}

}
