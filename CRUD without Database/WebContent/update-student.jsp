<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<input type="hidden" name="command" value="UPDATE">
		<c:set var="Student" value="${STUDENT}"></c:set>
		ID:<input type="text" name="id" value="${Student.id}"><br>
		<br> Name:<input type="text" name="name" value="${Student.name}"><br>
		<br> E-mail:<input type="text" name="email"
			value="${Student.email}"><br>
		<br> Std:<input type="text" name="std" value="${Student.std}"><br>
		<br> <input type="submit" value="Submit">

	</form>
</body>
</html>