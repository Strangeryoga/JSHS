package com.ty.s;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/lu")
public class LU extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		HttpSession session=req.getSession();
		RequestDispatcher dispatcher=null;
		PrintWriter out=resp.getWriter();
		
		String uname=req.getParameter("un");
		String upwd=req.getParameter("ps");

		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connection establishe");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("connection establish");
//			
			String sql=("select * from info1.form where uname= '"+uname+"' and upwd='"+upwd+"'");
//			
			
			Statement st=con.createStatement();
			
			
			ResultSet rs=((java.sql.Statement) st).executeQuery(sql);
			
			if(rs.next()) {
				resp.sendRedirect("index.html");

			 out.print(uname+"<h1>Welcome</h1>");
			 }else {
				 out.print("<h1>Failed</h1>");
				 resp.sendRedirect("new1.html");
			 }
				

			
		}
			
			catch(Exception e){
				System.out.println("error");
				e.printStackTrace();

			}

		
		
		
		
	}

}
