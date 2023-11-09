package org.jsp.student.controller;

import org.jsp.student.dao.Student_Dao;
import org.jsp.student.dto.Student;

public class Student_Controller {

	public static void main(String[] args) {
		Student student=new Student();
		student.setId(11);
		student.setName("Java12");
		student.setAddress("JS");
		student.setMno(989340942l);
		
		Student_Dao dao=new Student_Dao();
//		dao.saveStudent(student);
		
	    Student s1=dao.findById(11);
//	    System.out.println(s1);
//	    if(s1!=null) {
//	    	System.out.println(s1);
//	    }else {
//	    	System.out.println("data not found");
//	    }
	    
	    dao.update(student);
	}
}
