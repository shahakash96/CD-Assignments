package com.collections.sort.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
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

	public String toString() {
		return id + ": " + name;
	}
}

public class ListSorting {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();

		people.add(new Person(23, "Nehal"));
		people.add(new Person(2, "Vishal"));
		people.add(new Person(59, "Juhi"));

		// sort in order by id
		Collections.sort(people, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {

				if (p1.getId() > p2.getId()) {
					return 1;
				} else if (p1.getId() < p2.getId()) {
					return -1;
				}
				return 0;
			}
		});

		for (Person person : people) {
			System.out.println(person);
		}

		// sort in order by name
		Collections.sort(people, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});

		for (Person person : people) {
			System.out.println(person);
		}

	}
}
