package com.oops.encapsulation;

public class PersonInfo {

	public static void main(String[] args) {

		Person person1 = new Person();

		// we can access public variable outside of class
		person1.city = "Ahmedabad";

		/*
		 * we can access protected variable within the same package and the
		 * subclass of that class can access that variable even if it is in
		 * different package
		 */
		person1.panNo = "ABDC1489";
		/*
		 * we can't access private variable outside the class if we want to
		 * access those variables using setter and getter method
		 * person1.firstNane = Juhi This will give an error we can't define
		 * private variable without particular method.
		 */
		person1.setFirstName("Juhi");
		person1.setLastName("Soni");

		System.out.println(person1.display());

	}

}
