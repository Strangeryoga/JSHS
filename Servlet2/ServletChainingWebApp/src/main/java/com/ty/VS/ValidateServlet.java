package com.ty.VS;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("us");
		String password=req.getParameter("ps");
		

		if(password.equals("Tom")) {
			RequestDispatcher rd=req.getRequestDispatcher("welcome");
			rd.forward(req, resp);
		}
		else {
			PrintWriter out=resp.getWriter();
			out.print("<h1>Sorry username or password is incorrect</h1>");
			RequestDispatcher rd= req.getRequestDispatcher("login.html");
			rd.include(req, resp);
			
		}
		
	}

}

