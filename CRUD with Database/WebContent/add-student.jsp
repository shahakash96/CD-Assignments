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
		<input type="hidden" name="command" value="ADD"> First Name:<input
			type="text" name="firstName"><br>
		<br> Last Name:<input type="text" name="lastName"><br>
		<br> Email:<input type="text" name="email"><br>
		<br> <input type="submit" value="Submit">

	</form>

	<a href="list-student.jsp">Back to main page</a>
</body>
</html>