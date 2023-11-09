package org.google.stuFetch;

import java.beans.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Student extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt("id");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			PreparedStatement ps=con.prepareStatement("insert into emp_info.employee values(?)");
			ps.executeUpdate();
			java.sql.Statement st= con.createStatement();
			st.execute("select * from emp_info.employee where id=?");
		} catch (Exception e) {
			
		}
		
	}

}
