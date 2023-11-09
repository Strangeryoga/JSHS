package com.ty.mp;

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

@WebServlet("/next")
public class Details extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			PreparedStatement st=con.prepareStatement("select * from info.student");
			ResultSet rs=st.executeQuery();

			PrintWriter ref=resp.getWriter();
			ref.print("<html><body bgcolor='cyan'><h1>Details</h1><table><tr><th><h1>id</h1></th><th><h1>name</h1></th><th><h1>place</h1></th></tr></table></body></html>");
			
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String place=rs.getString(3);
				

				PrintWriter ref1=resp.getWriter();
				ref1.print("<html><body bgcolor='cyan'><form action='nscqo' method='post'><h1> "+id+""+name+""+place+"</h1><button>update</button></form><button>delete</button></body></html>");
				

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
