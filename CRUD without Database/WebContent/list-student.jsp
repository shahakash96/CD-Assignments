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

	<form action="add-student.jsp">
		<input type="submit" value="Add Student"><br>
		<br>
	</form>


	<table border="1px">
		<tr>
			<th>FirstName</th>
			<th>Email</th>
			<th>Std</th>
			<th colspan="2">Action</th>
		</tr>

		<tr>
			<c:forEach var="tempStudent" items="${STUDENT_LIST}">
				<c:url var="Delete" value="StudentController">
					<c:param name="StudentId" value="${tempStudent.id}" />
					<c:param name="command" value="DELETE" />
				</c:url>
				<c:url var="Update" value="StudentController">
					<c:param name="StudentId" value="${tempStudent.id}" />
					<c:param name="command" value="LOAD" />
				</c:url>
				<tr>
					<td>${tempStudent.name}</td>
					<td>${tempStudent.email}</td>
					<td>${tempStudent.std}</td>
					<td><a href="${Update}">Update</a> |<a href="${Delete }"
						onclick="if (!(confirm('Are you sure you want to delete this student?')))return false">Delete</a>
					</td>
				</tr>
			</c:forEach>
	</table>

</body>
</html>