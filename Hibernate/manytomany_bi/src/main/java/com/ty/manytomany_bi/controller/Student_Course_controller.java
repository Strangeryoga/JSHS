package com.ty.manytomany_bi.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.manytomany_bi.dao.Student_Course_dao;
import com.ty.manytomany_bi.dto.Course;
import com.ty.manytomany_bi.dto.Student;

public class Student_Course_controller {
	
	public static void main(String[] args) {
		
		Course course=new Course();
		course.setName("java");
		course.setCost(238928);
		course.setDuration(120);
		
		Course course1=new Course();
		course1.setName("sql");
		course1.setCost(339203);
		course1.setDuration(10);
		
		Student student=new Student();
		student.setName("cd");
		student.setAddress("bhimw");
		
		Student student1=new Student();
		student1.setName("bheem");
		student1.setAddress("dholakpur");
		
		List<Course> list=new ArrayList<Course>();
		list.add(course);
		list.add(course1);
		
		List<Student> list2=new ArrayList<Student>();
		list2.add(student);
		list2.add(student1);
		
		course.setStudents(list2);
		course1.setStudents(list2);
		
		student.setCourses(list);
		student1.setCourses(list);
		
		Student_Course_dao dao=new Student_Course_dao();
		dao.saveStudent(student);
		dao.saveStudent(student1);
		
//		dao.saveCourse(course);
//		dao.saveCourse(course1);
		
		
		
	}

}
