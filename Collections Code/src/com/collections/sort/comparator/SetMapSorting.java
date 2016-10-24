package com.collections.sort.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Jungle {

	private String animal;

	public Jungle(String animal) {
		super();
		this.animal = animal;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	@Override
	public String toString() {
		return "Jungle [animal=" + animal + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animal == null) ? 0 : animal.hashCode());
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
		Jungle other = (Jungle) obj;
		if (animal == null) {
			if (other.animal != null)
				return false;
		} else if (!animal.equals(other.animal))
			return false;
		return true;
	}

}

public class SetMapSorting {
	public static void main(String arg[]) {

		Set<Jungle> set = new HashSet<>();
		Map<Jungle, Integer> map = new HashMap<>();

		set.add(new Jungle("Lion"));
		set.add(new Jungle("Dog"));
		set.add(new Jungle("Elephant"));

		map.put(new Jungle("Lion"), 5);
		map.put(new Jungle("Dog"), 8);
		map.put(new Jungle("Elephant"), 2);

		// sorting the set
		/*
		 * List<Jungle> list=new ArrayList<Jungle>(set);
		 * 
		 * Collections.sort(list, new Comparator<Jungle>(){
		 * 
		 * @Override public int compare(Jungle o1, Jungle o2) {
		 * 
		 * int len1 = o1.getAnimal().length(); int len2 =
		 * o2.getAnimal().length();
		 * 
		 * if(len1 > len2){ return 1; } if(len1 < len2){ return -1; } return 0;
		 * }
		 * 
		 * });
		 * 
		 * for(Jungle jungle:list){ System.out.println(jungle); }
		 */

		// sorting the map by value
		/*
		 * List<Map.Entry<Jungle, Integer>> list = new
		 * LinkedList<Map.Entry<Jungle, Integer>>(map.entrySet());
		 * 
		 * Collections.sort(list, new Comparator<Map.Entry<Jungle, Integer>>() {
		 * 
		 * @Override public int compare(Map.Entry<Jungle, Integer> o1,
		 * Map.Entry<Jungle, Integer> o2) {
		 * 
		 * return (o1.getValue()).compareTo(o2.getValue());
		 * 
		 * }
		 * 
		 * });
		 */

		// sorting the map by key
		List<Map.Entry<Jungle, Integer>> list = new LinkedList<Map.Entry<Jungle, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Jungle, Integer>>() {

			@Override
			public int compare(Map.Entry<Jungle, Integer> o1, Map.Entry<Jungle, Integer> o2) {

				int len1 = o1.getKey().getAnimal().length();
				int len2 = o2.getKey().getAnimal().length();

				if (len1 > len2) {
					return 1;
				}
				if (len1 < len2) {
					return -1;
				}
				return 0;
			}

		});

		for (Map.Entry<Jungle, Integer> entry : list) {

			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
