<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
	<h1>Gujarat Technological University</h1>
	<br>

	<form action="StudentController" method="post">
		<input type="hidden" name="command" value="ADD"> ID:<input
			type="text" name="id"><br>
		<br> Name:<input type="text" name="name"><br>
		<br> E-mail:<input type="text" name="email"><br>
		<br> Std:<input type="text" name="std"><br>
		<br> <input type="submit" value="Submit">

	</form>

	<a href="list-student.jsp">Back to main page</a>
</body>
</html>