package com.crud.without.database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.catalina.connector.Request;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class StudentUtil {
	static List<Student> list = new ArrayList<Student>() ;
	
	/*{
		list = new ArrayList<Student>();
		
		Student s1 = new Student(1, "Juhi", "juhisoni4@gmail.com", 11);
		Student s2 = new Student(2, "Nehal", "nehalsoni23@gmail.com", 10);
		Student s3 = new Student(3, "Vishal", "Vishal.Rangras@gmail.com", 12);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
							
	}*/	

	public static List<Student> listStudent() {

		return list;
	}

	public static void addStudent(Student student) {
		
		list.add(student);
	}

	public static void deleteStudent(int id) {

		Student student2 = findStudent(id);
		
		int index = list.indexOf(student2);
		
		list.remove(index);	
		
	}

	public static Student findStudent(int id) {

		List<Student> list1 = listStudent();

		Student student1 = null;

		for (Student student : list1) {

			if (student.getId() == id) {

				student1 = student;
			}
		}
		
		return student1;
	}
		
}

	

