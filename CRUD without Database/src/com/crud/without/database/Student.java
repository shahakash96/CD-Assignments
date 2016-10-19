package com.crud.without.database;

public class Student {

	private int id;
	private String name;
	private String email;
	private int std;
	
	public Student(int id, String name, String email, int std) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.std = std;
	}

	public Student(String name, String email, int std) {
		super();
		this.name = name;
		this.email = email;
		this.std = std;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", std=" + std + "]";
	}
	
	
	
	
}
