package com.ty.s;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/su")
public class SU extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		String user=req.getParameter("us");
		String pass=req.getParameter("ps");
		String email=req.getParameter("em");
		String no=req.getParameter("no");
		
		RequestDispatcher dispatcher=null;

		try{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("connection establishe");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		System.out.println("passwordmatch");
		PreparedStatement stmt=con.prepareStatement("insert into info1.form(uname,upwd,uemail,umobile) values(?,?,?,?)");
		stmt.setString(1, user);
		stmt.setString(2, pass);
		stmt.setString(3, email);
		stmt.setString(4, no);
		
		int row=stmt.executeUpdate();
		
		dispatcher=req.getRequestDispatcher("new1.html");
		if(row>0) {
			req.setAttribute("status", "success");
		}else {
			req.setAttribute("status", "failed");
		}
		dispatcher.forward(req, resp);
		

		}
		catch(Exception e){
			System.out.println("error");
		}

		
	}
}
