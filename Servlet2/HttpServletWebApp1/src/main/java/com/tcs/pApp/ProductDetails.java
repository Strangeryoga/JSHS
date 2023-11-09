package com.tcs.pApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cal")
public class ProductDetails extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resq) throws
	ServletException,IOException {
		int Pno=Integer.parseInt(req.getParameter("pn"));
		String Pname=req.getParameter("nm");
		String PQty=req.getParameter("pq");
		String PPrice=req.getParameter("pp");
		
		System.out.println("Pno is"+Pno+"Pname is"+Pname+"Pqu is"+PQty+"Pp is "+PPrice);
		PrintWriter ref=resq.getWriter();
		ref.print("<html><body bgcolor='cyan'><h1>Pno is "+Pno+" Pname is "+Pname+" PQty is "+PQty+" Pprice is "+PPrice+"</h1></body></html>");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			PreparedStatement ps=con.prepareStatement("insert into product.details values(?,?,?,?)");
			ps.setInt(1, Pno);
			ps.setString(2, Pname);
			ps.setString(3, PQty);
			ps.setString(4, PPrice);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	 

}
