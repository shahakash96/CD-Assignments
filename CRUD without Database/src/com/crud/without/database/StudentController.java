package com.crud.without.database;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String command = request.getParameter("command");

		if (command == null) {

			command = "LIST";
		}

		switch (command) {

		case "LIST":
			listStudent(request, response);
			break;
			
		case "DELETE":
			deleteStudent(request,response);
			break;
			
		case "LOAD":
			loadStudent(request,response);
			break;
		}
	}

	private void loadStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("StudentId"));
		
		Student student = StudentUtil.findStudent(id);
		
		request.setAttribute("STUDENT", student);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("update-student.jsp");
		dispatcher.forward(request, response);
				
	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("StudentId"));
						
		StudentUtil.deleteStudent(id);
		
		listStudent(request, response);
	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//fetch the information from the form
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int std = Integer.parseInt(request.getParameter("std"));

		//create the student object 
		Student student = new Student(id, name, email, std);

		//add the student in the list
		StudentUtil.addStudent(student);
		
		listStudent(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String command = request.getParameter("command");

		if (command == null) {

			command = "LIST";
		}
		
		switch (command) {

		case "LIST":
			listStudent(request, response);
			break;

		case "ADD":
			addStudent(request, response);
			break;
			
		case "UPDATE":
			updateStudent(request,response);
			break;
		}	
}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//fetch the information from the form
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int std = Integer.parseInt(request.getParameter("std"));
		
		//find the student based on id
		Student student2 = StudentUtil.findStudent(id);
		
		List<Student> studentList = StudentUtil.listStudent();
		
		//remove the student from the list
		int a = studentList.indexOf(student2);
		studentList.remove(a);
		
		//set the variable 
		student2.setEmail(email);
		student2.setName(name);
		student2.setStd(std);
		
		//add the updated student in the list
		studentList.add(a, student2);
		
		listStudent(request, response);		
								
	}

	public void listStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// get the list of the student
		List<Student> student = StudentUtil.listStudent();

		//set the attribute of student list
		request.setAttribute("STUDENT_LIST", student);

		// forward the list of the student to view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-student.jsp");
		dispatcher.forward(request, response);

	}

}
