package com.crud.with.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.sql.DataSource;

public class StudentDbUtil {

	@Resource(name = "jdbc/student-tracker")
	public DataSource dataSource;

	Connection myConn;
	Statement myStmt;
	ResultSet myRs;
	PreparedStatement myPstmt;

	public StudentDbUtil(DataSource theDataSource) {
		this.dataSource = theDataSource;
	}

	public List<Student> listStudent() throws SQLException {

		List<Student> students = new ArrayList<>();

		try {
			myConn = dataSource.getConnection();

			myStmt = myConn.createStatement();

			String sql = "select * from student";

			myRs = myStmt.executeQuery(sql);

			while (myRs.next()) {
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");

				Student student = new Student(id, firstName, lastName, email);

				students.add(student);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(myConn, myStmt, myRs);
		}

		return students;
	}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) throws SQLException {

		if (myRs != null) {
			myRs.close();
		}

		if (myStmt != null) {
			myStmt.close();
		}

		if (myConn != null) {
			myConn.close();
		}

	}

	public void addStudent(Student student) {

		try {
			myConn = dataSource.getConnection();

			String sql = "insert into student" + "(first_name, last_name, email)" + "values " + "(?,?,?)";

			myPstmt = myConn.prepareStatement(sql);

			myPstmt.setString(1, student.getFirstName());
			myPstmt.setString(2, student.getLastName());
			myPstmt.setString(3, student.getEmail());

			int rowAffected = myPstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close(myConn, myPstmt, myRs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public Student getStudent(int id) {

		Student student = null;
		try {
			myConn = dataSource.getConnection();

			String sql = "select * from student where id=?";
			
			System.out.println(id);

			myPstmt = myConn.prepareStatement(sql);

			myPstmt.setInt(1, id);

			myRs = myPstmt.executeQuery();

			while (myRs.next()) {
			
				student = new Student();
				student.setId(myRs.getInt("id"));
				student.setFirstName(myRs.getString("first_name"));
				student.setLastName(myRs.getString("last_name"));
				student.setEmail(myRs.getString("email"));
		}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close(myConn, myPstmt, myRs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return student;
	}

	public void updateStudent(Student student) {

		try {
			myConn = dataSource.getConnection();

			String sql = "update student set first_name=?, last_name=?, email=? where id=?";

			myPstmt = myConn.prepareStatement(sql);

			myPstmt.setString(1, student.getFirstName());
			myPstmt.setString(2, student.getLastName());
			myPstmt.setString(3, student.getEmail());
			myPstmt.setInt(4, student.getId());

			int rowAffected = myPstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close(myConn, myPstmt, myRs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void deleteStudent(int id) {
		try {
			myConn = dataSource.getConnection();

			String sql = "delete from student where id=?";

			myPstmt = myConn.prepareStatement(sql);

			myPstmt.setInt(1, id);

			int rowAffected = myPstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close(myConn, myPstmt, myRs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}