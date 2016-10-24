package com.oops.encapsulation.protecteddemo;

import com.oops.encapsulation.Person;

public class ProtectedDemo extends Person {

	private String Address;
	
	public ProtectedDemo() {
		super();
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	@Override
	public String display() {
		System.out.println(super.display());
		return "Person [Address=" + Address + ", panNo=" + panNo + ", city=" + city + "]";
	}

	public static void main(String[] args) {
			
		ProtectedDemo person = new ProtectedDemo();
		
		person.panNo = "BHJ1458";
		person.city = "Ahmedabad";//we can access protected variable of parent class even if it is in different package
		person.setFirstName("Nehal");
		person.setLastName("Soni");
		person.setAddress("B-6 Shankhanad Flat,Naranpura");

		System.out.println(person.display());
		
	}

}
