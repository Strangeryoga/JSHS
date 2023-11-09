package org.jsp.Details_controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.Details_dao.Details_dao;
import org.jsp.Details_dto.Details_dto;

@WebServlet("/det")
public class Details_controller extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("nm");
		String address=req.getParameter("add");
		String phoneno=req.getParameter("pn");
		String email=req.getParameter("em");
		
		Details_dto dto=new Details_dto(name, address, phoneno, email);
		
		Details_dao dao=new Details_dao();
		dao.saveCustomer(dto);
		
		System.out.println(dto);
		
		
		
	}

}
