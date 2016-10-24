package com.collections.custom.object;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

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

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	static Person p1 = new Person("Nehal", "Soni");
	static Person p2 = new Person("Juhi", "Soni");
	static Person p3 = new Person("Vishal", "Rangras");
	static Person p4 = new Person("Juhi", "Soni");

	public static void main(String arg[]) {

		List<Person> list = new ArrayList<Person>();
		Set<Person> set = new HashSet<Person>();
		Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();

		addItems("List", list);
		addItems("Set", set);

		displayItems("List", list);
		displayItems("Set", set);

		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 4);
		
		//map and set overrides the duplicate value
		
		for(Map.Entry<Person, Integer> entry:map.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void addItems(String collection, Collection<Person> col) {
		col.add(p1);
		col.add(p2);
		col.add(p3);
		col.add(p4);
	}

	public static void displayItems(String collection, Collection<Person> col) {

		System.out.println(collection);
		
		Iterator<Person> it = col.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
	}
}
