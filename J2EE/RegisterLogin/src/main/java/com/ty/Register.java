package com.ty;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		String gender=req.getParameter("gender1");
		String city=req.getParameter("city");
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			
			PreparedStatement ps=con.prepareStatement("insert into jsjm.register values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, pass);
			ps.setString(4, gender);
			ps.setString(5, city);
			
			int c=ps.executeUpdate();
			if(c>0) {
				
				resp.setContentType("text/html");
				out.print("<h3 style='color:green'>User register done</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
			}else {
				resp.setContentType("text/html");
				out.print("<h3 style='color:red'>User register failed</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
			}

		} catch (Exception e) {
			resp.setContentType("text/html");
			out.print("<h3 style='color:red'>Exception occured :"+e.getMessage()+"</h3>");
			RequestDispatcher rd=req.getRequestDispatcher("/register.jsp");
			rd.include(req, resp);
		}

	}
}
