package com.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapCode {

	public static void main(String[] args) {

		//don't maintain the order
		Map<Integer, String> map = new HashMap<>();
		
		//maintain the natural order
		//Map<Integer, String> map = new TreeMap<>();
		
		//maintain the insertion order
		//Map<Integer, String> map = new LinkedHashMap<>();

		map.put(2, "Juhi");
		map.put(4, "Nehal");
		map.put(3, "Vatsal");

		System.out.println(map.isEmpty());
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.get(2));
		
		map.clear();
		
		System.out.println(map.isEmpty());
	
	}

}
