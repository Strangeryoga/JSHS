<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="register" method="post">  
		Name: <input type='text' name='name'/> <br/><br/>
		Email: <input type='text' name='email'/> <br/><br/>
		Password: <input type='password' name='pass'/> <br/><br/>
		Gender: <input type='radio' name='gender1' value="Male"/>Male<input type='radio' name='gender2' value="Female"/> Female <br/><br/>
		City: <select name='city'>
		<option>Select city</option>
		<option>Delhi</option>
		<option>Mumbai</option>
		<option>Pune</option>
		</select><br/><br/>
		<input type="submit" value="Register"/>
</form>
</body>
</html>