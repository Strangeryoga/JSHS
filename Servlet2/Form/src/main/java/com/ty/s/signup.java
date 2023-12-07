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

@WebServlet("/sign")
public class signup extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		String name=req.getParameter("nm");
		String email=req.getParameter("em");
		String pass=req.getParameter("ps");
		String cpass=req.getParameter("cps");
		
		RequestDispatcher dispatcher=null;

		try{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("connection establishe");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		System.out.println("passwordmatch");
		PreparedStatement stmt=con.prepareStatement("insert into info1.form2(uname,uemail,upass,ucpass) values(?,?,?,?)");
		stmt.setString(1, name);
		stmt.setString(2, email);
		stmt.setString(3, pass);
		stmt.setString(4, cpass);
		
		int row=stmt.executeUpdate();
		
		dispatcher=req.getRequestDispatcher("login.html");
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
