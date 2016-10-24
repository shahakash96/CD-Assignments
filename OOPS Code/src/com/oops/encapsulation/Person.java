package com.oops.encapsulation;

public class Person {

	private String firstName;
	private String lastName;
	public String panNo;
	protected String city;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String display() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", panNo=" + panNo + ", city=" + city
				+ "]";
	}
}
