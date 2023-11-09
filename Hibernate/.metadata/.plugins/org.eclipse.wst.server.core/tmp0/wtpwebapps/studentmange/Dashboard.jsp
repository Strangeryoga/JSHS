<%@page import="com.student_management_system.dto.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student-Management-System</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap" rel="stylesheet">
</head>
</head>
<style>
   body{
		height:60vh;
		width:100vw;
		display: flex;
		flex-direction: column;
		align-items: center;
		justify-content: center; 
		font-family: 'Poppins', sans-serif;
	}
	a{
		padding:.5em 1em;
		font-size: 1.3rem;
		border: 3px solid #565656;
		border-radius: 50px;
		text-decoration: none;
		color: #303030;
		margin: .5rem 2rem;
		font-weight: 600;
	}
	a:hover{
		background-color: salmon;
		color: #fff;
		border: 3px solid salmon;
	}
	h1{
		padding:3rem 0rem 0rem 0rem;
		font-size: 7rem;
		color: #565656;
		background-color:#f6f6f6;
		width: 100%;
		text-align: center;
		font-weight: 500;
		margin: 0
	}
	h3{
		padding: 0rem;
		padding-bottom:3rem;
		font-weight: 500;
		font-size: 1.3rem;
		background-color: #f6f6f6;
		width: 100%;
		text-align: center;
		margin: 0;
		margin-bottom: 3rem;
	}
	.a{
		width: 100%;
		display: flex;
		justify-content: center;
}
	.logout{
		width:100%;
		position:fixed;
	}
</style>
<body>
<% Admin admin=(Admin)session.getAttribute("admin");
   if(admin!=null){   
    %>
   <h1>Welcome Admin</h1>
   <h3>You can manage student data here!!</h3>
   <div class="a">
       <a href="saveStudent.jsp">Save_Student</a>
       <a href="viewStudents">View_Students</a>
   </div>
   <%} else{ 
	   response.sendRedirect("AdminLogin.jsp");
   }
   %>
   <div class="logout"><a href="logout">Logout</a></div>
</body>
</html>