<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("nm");
String place=request.getParameter("pl");

try{
Class.forName("com.mysql.jdbc.Driver");

}catch(Exception e){
	System.out.println("Error");
}

%>
</body>
</html>