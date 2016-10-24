package com.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCode {

	public static void main(String[] args) {
		
		//don't maintain the order
		Set<String> set = new HashSet<>();
		
		//maintain the insertion order
		//Set<String> set = new LinkedHashSet<>();
		
		//maintain the natural order
		//Set<String> set = new TreeSet<>();
		
		set.add("Nehal");
		set.add("Vatsal");
		set.add("Juhi");
		
		for(String set1:set){
			System.out.println(set1);
		}

	}

}
